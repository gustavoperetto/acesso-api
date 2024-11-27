package soft.com.gperetto.acesso_api.adapter.converter;

import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.dto.UsuarioDTO;
import soft.com.gperetto.acesso_api.core.domain.Pessoa;
import soft.com.gperetto.acesso_api.core.domain.Usuario;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDTO usuarioDTO) {
        return new Usuario(
                usuarioDTO.getId(),
                usuarioDTO.getEmail(),
                usuarioDTO.getSenha(),
                usuarioDTO.getAdministrador(),
                new Pessoa(null, usuarioDTO.getNome())
        );
    }

    public UsuarioDTO toDto(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(),usuario.getPessoa().getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getAdministrador());
    }
}
