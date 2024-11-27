package soft.com.gperetto.acesso_api.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrador;

}