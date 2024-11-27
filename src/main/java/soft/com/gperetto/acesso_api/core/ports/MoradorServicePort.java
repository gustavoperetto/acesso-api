package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Morador;

//Porta de entrada
public interface MoradorServicePort {

    Morador createMorador(Morador morador);
}
