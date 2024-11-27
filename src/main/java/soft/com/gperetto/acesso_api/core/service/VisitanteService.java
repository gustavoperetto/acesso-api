package soft.com.gperetto.acesso_api.core.service;

import soft.com.gperetto.acesso_api.core.domain.Visitante;
import soft.com.gperetto.acesso_api.core.ports.VisitanteRepositoryPort;
import soft.com.gperetto.acesso_api.core.ports.VisitanteServicePort;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) {
        Visitante visitanteExistente = visitanteRepositoryPort.obtainByRg(visitante.getRg());
        if (visitanteExistente != null) {
            throw new IllegalArgumentException("Já existe um visitante com este RG.");
        }
        return visitanteRepositoryPort.create(visitante);
    }
}
