package com.condominios.app.openapi;

import com.condominios.app.model.Chamado;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "Chamados")
public interface ChamadoControllerOpenApi {
    @Operation(summary = "abre um novo chamado")
    ResponseEntity<Chamado> criarChamado(@Valid @RequestBody Chamado chamadoCreateDTO);

    @Operation(summary = "busca todos os chamados abertos")
    ResponseEntity<List<Chamado>> buscarChamado();
}
