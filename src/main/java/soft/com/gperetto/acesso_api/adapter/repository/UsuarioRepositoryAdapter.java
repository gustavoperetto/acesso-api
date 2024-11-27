package soft.com.gperetto.acesso_api.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.entity.UsuarioEntity;
import soft.com.gperetto.acesso_api.core.domain.Usuario;
import soft.com.gperetto.acesso_api.core.ports.UsuarioRepositoryPort;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoaEntity(pessoaRepository.createPessoa(usuario.getPessoa()));
        UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity);
        return modelMapper.map(novoUsuario, Usuario.class);
    }

    @Override
    public Usuario obtainByEmail(String email) {
        UsuarioEntity usuarioByEmail = usuarioRepository.findByEmail(email);
        if (usuarioByEmail == null) {
            return null;
        }
        return modelMapper.map(usuarioByEmail, Usuario.class);
    }
}
