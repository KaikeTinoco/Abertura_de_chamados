package com.condominios.app.controller;

import com.condominios.app.dto.ManutencaoCreateDTO;
import com.condominios.app.model.ManutencaoAvulsa;
import com.condominios.app.openapi.ManutencaoControllerOpenApi;
import com.condominios.app.service.ManutencaoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manutencoes")
public class ManutencaoController implements ManutencaoControllerOpenApi {
    private final ManutencaoService manutencaoService;

    @Autowired
    public ManutencaoController(ManutencaoService manutencaoService) {
        this.manutencaoService = manutencaoService;
    }


    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "busca realizada com sucesso"))
    @GetMapping("/buscaGeral")
    public ResponseEntity<List<ManutencaoAvulsa>> buscaGeral(){
        return ResponseEntity.ok(manutencaoService.buscaGeral());
    }

    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "criado com sucesso"))
    @PostMapping("/cadastroManutencao")
    public ResponseEntity<ManutencaoAvulsa> criarManutencao(@Valid @RequestBody ManutencaoCreateDTO dto){
        return ResponseEntity.ok(manutencaoService.criarManutencao(dto));
    }
}
