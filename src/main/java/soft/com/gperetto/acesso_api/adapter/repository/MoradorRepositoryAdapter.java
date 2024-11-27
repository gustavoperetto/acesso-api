package soft.com.gperetto.acesso_api.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.entity.MoradorEntity;
import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.ports.MoradorRepositoryPort;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtainByCpf(String cpf) {
        MoradorEntity moradorByCpf = moradorRepository.findByCpf(cpf);
        if (moradorByCpf == null) {
            return null;
        }
        return modelMapper.map(moradorByCpf, Morador.class);
    }
}
