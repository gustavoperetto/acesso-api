package soft.com.gperetto.acesso_api.adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.com.gperetto.acesso_api.adapter.entity.VisitanteEntity;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    VisitanteEntity findByRg(String rg);

}
