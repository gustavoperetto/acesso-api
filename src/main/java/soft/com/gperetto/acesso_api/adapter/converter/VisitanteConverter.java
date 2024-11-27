package soft.com.gperetto.acesso_api.adapter.converter;

import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.dto.MoradorDTO;
import soft.com.gperetto.acesso_api.adapter.dto.VisitanteDTO;
import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.domain.Pessoa;
import soft.com.gperetto.acesso_api.core.domain.Visitante;

@Component
public class VisitanteConverter {

    public Visitante toDomain(VisitanteDTO visitanteDTO) {
        return new Visitante(
                visitanteDTO.getId(),
                visitanteDTO.getRg(),
                new Pessoa(null, visitanteDTO.getNome())
        );
    }

    public VisitanteDTO toDto(Visitante visitante) {
        return new VisitanteDTO(
                visitante.getId(),
                visitante.getPessoa().getNome(),
                visitante.getRg());
    }
}
