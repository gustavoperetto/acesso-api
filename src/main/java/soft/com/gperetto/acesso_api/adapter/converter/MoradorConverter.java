package soft.com.gperetto.acesso_api.adapter.converter;

import org.springframework.stereotype.Component;
import soft.com.gperetto.acesso_api.adapter.dto.MoradorDTO;
import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.domain.Pessoa;

@Component
public class MoradorConverter {

    public Morador toDomain(MoradorDTO moradorDTO) {
        return new Morador(
                moradorDTO.getId(),
                moradorDTO.getCpf(),
                moradorDTO.getEndereco(),
                moradorDTO.getCelular(),
                new Pessoa(null, moradorDTO.getNome())
        );
    }

    public MoradorDTO toDto(Morador morador) {
        return new MoradorDTO(
                morador.getId(),
                morador.getPessoa().getNome(),
                morador.getCpf(),
                morador.getEndereco(),
                morador.getCelular());
    }
}
