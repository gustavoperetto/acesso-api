package soft.com.gperetto.acesso_api.adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.com.gperetto.acesso_api.adapter.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    UsuarioEntity findByEmail(String email);
}
