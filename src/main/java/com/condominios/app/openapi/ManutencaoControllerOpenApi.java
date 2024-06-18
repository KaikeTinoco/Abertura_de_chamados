package com.condominios.app.openapi;

import com.condominios.app.dto.ManutencaoCreateDTO;
import com.condominios.app.model.ManutencaoAvulsa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "Manutencao")
public interface ManutencaoControllerOpenApi {
    @Operation(summary = "cria uma nova manutenção avulsa")
    ResponseEntity<ManutencaoAvulsa> criarManutencao(@Valid @RequestBody ManutencaoCreateDTO dto);

    @Operation(summary = "busca todas as manutenções existentes")
    ResponseEntity<List<ManutencaoAvulsa>> buscaGeral();
}
