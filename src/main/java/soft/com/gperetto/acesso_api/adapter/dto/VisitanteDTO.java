package soft.com.gperetto.acesso_api.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitanteDTO {

    private Long id;
    private String nome;
    private String rg;

}
