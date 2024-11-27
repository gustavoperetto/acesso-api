package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Visitante;

//Porta de saída
public interface VisitanteRepositoryPort {

    public Visitante create(Visitante visitante);

    public Visitante obtainByRg(String rg);
}
