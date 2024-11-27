package soft.com.gperetto.acesso_api.adapter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import soft.com.gperetto.acesso_api.adapter.converter.MoradorConverter;
import soft.com.gperetto.acesso_api.adapter.converter.VisitanteConverter;
import soft.com.gperetto.acesso_api.adapter.dto.MoradorDTO;
import soft.com.gperetto.acesso_api.adapter.dto.VisitanteDTO;
import soft.com.gperetto.acesso_api.core.domain.Morador;
import soft.com.gperetto.acesso_api.core.domain.Visitante;
import soft.com.gperetto.acesso_api.core.ports.MoradorServicePort;
import soft.com.gperetto.acesso_api.core.ports.VisitanteServicePort;

@RestController
@RequestMapping("api/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteConverter visitanteConverter;
    private final VisitanteServicePort visitanteServicePort;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDTO create(@RequestBody VisitanteDTO visitanteDTO) {
        Visitante visitante = visitanteServicePort.createVisitante(visitanteConverter.toDomain(visitanteDTO));
        return visitanteConverter.toDto(visitante);
    }

}
