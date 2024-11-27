package soft.com.gperetto.acesso_api.core.service;

import soft.com.gperetto.acesso_api.core.domain.Usuario;
import soft.com.gperetto.acesso_api.core.ports.UsuarioRepositoryPort;
import soft.com.gperetto.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
        if(usuarioExistente != null) {
            throw new IllegalArgumentException("Já existe um usuário com o email informado.");
        }
        return usuarioRepositoryPort.create(usuario);
    }
}
