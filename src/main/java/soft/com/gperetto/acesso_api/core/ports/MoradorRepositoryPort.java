package soft.com.gperetto.acesso_api.core.ports;

import soft.com.gperetto.acesso_api.core.domain.Morador;

//Porta de saída
public interface MoradorRepositoryPort {

    public Morador create(Morador morador);

    public Morador obtainByCpf(String cpf);
}
