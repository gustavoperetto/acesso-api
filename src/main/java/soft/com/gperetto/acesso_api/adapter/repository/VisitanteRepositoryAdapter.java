package soft.com.gperetto.acesso_api.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.entity.VisitanteEntity;
import soft.com.gperetto.acesso_api.core.domain.Visitante;
import soft.com.gperetto.acesso_api.core.ports.VisitanteRepositoryPort;

@Component
@RequiredArgsConstructor
public class VisitanteRepositoryAdapter implements VisitanteRepositoryPort {

    private final VisitanteRepository visitanteRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Visitante create(Visitante visitante) {
        VisitanteEntity entity = modelMapper.map(visitante, VisitanteEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(visitante.getPessoa()));
        return modelMapper.map(visitanteRepository.save(entity), Visitante.class);
    }

    @Override
    public Visitante obtainByRg(String rg) {
        VisitanteEntity visitantebyRg = visitanteRepository.findByRg(rg);
        if (visitantebyRg == null) {
            return null;
        }
        return modelMapper.map(visitantebyRg, Visitante.class);
    }
}
