package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Visitante;

//Porta de entrada
public interface VisitanteServicePort {

    Visitante createVisitante(Visitante visitante);
}
