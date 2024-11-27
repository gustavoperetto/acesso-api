package soft.com.gperetto.acesso_api.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soft.com.gperetto.acesso_api.core.ports.*;
import soft.com.gperetto.acesso_api.core.service.MoradorService;
import soft.com.gperetto.acesso_api.core.service.UsuarioService;
import soft.com.gperetto.acesso_api.core.service.VisitanteService;

@Configuration
public class BeanConfig {

    @Bean
    public ModelMapper ModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServiceImpl(MoradorRepositoryPort moradorRepositoryPort) {
        return new MoradorService(moradorRepositoryPort);
    }

    @Bean
    public VisitanteServicePort visitanteServiceImpl(VisitanteRepositoryPort visitanteRepositoryPort) {
        return new VisitanteService(visitanteRepositoryPort);
    }
}
