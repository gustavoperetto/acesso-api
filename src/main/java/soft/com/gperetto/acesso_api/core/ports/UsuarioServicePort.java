package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Usuario;
//Porta de entrada
public interface UsuarioServicePort {

    Usuario createUsuario(Usuario usuario);
}
