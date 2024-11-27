package soft.com.gperetto.acesso_api.adapter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import soft.com.gperetto.acesso_api.adapter.converter.UsuarioConverter;
import soft.com.gperetto.acesso_api.adapter.dto.UsuarioDTO;
import soft.com.gperetto.acesso_api.core.ports.UsuarioServicePort;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioConverter.toDto(usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDTO)));
    }
}
