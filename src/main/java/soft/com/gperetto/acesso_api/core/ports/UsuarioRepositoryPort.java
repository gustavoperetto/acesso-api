package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Usuario;

//Porta de saída
public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);

    public Usuario obtainByEmail(String email);
}
