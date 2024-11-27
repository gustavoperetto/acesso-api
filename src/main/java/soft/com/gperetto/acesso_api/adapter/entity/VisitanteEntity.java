package soft.com.gperetto.acesso_api.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_visitante")
public class VisitanteEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String rg;

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;

}
