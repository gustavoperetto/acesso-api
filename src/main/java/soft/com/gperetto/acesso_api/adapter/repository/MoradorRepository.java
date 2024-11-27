package soft.com.gperetto.acesso_api.adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.com.gperetto.acesso_api.adapter.entity.MoradorEntity;

public interface MoradorRepository extends JpaRepository<MoradorEntity, Long> {

    MoradorEntity findByCpf(String cpf);
}
