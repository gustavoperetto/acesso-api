package soft.com.gperetto.acesso_api.adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.com.gperetto.acesso_api.adapter.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
