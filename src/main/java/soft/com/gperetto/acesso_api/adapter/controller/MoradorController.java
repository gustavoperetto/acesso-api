package soft.com.gperetto.acesso_api.adapter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import soft.com.gperetto.acesso_api.adapter.converter.MoradorConverter;
import soft.com.gperetto.acesso_api.adapter.dto.MoradorDTO;
import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.ports.MoradorServicePort;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDTO create(@RequestBody MoradorDTO moradorDTO) {
        Morador novoMorador = moradorServicePort.createMorador(moradorConverter.toDomain(moradorDTO));
        return moradorConverter.toDto(novoMorador);
    }
}
