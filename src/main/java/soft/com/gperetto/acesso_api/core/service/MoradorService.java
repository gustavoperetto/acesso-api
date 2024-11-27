package soft.com.gperetto.acesso_api.core.service;


import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.ports.MoradorRepositoryPort;
import soft.com.gperetto.acesso_api.core.ports.MoradorServicePort;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
        Morador moradorExistente = moradorRepositoryPort.obtainByCpf(morador.getCpf());
        if (moradorExistente!= null) {
            throw new IllegalArgumentException("Morador já cadastrado com esse CPF.");
        }
        return moradorRepositoryPort.create(morador);
    }
}
