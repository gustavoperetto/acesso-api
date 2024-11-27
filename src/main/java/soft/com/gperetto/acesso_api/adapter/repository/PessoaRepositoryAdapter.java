package soft.com.gperetto.acesso_api.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.entity.PessoaEntity;
import soft.com.gperetto.acesso_api.core.domain.Pessoa;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdapter {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaEntity createPessoa(Pessoa pessoa) {
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntity);
    }
}
