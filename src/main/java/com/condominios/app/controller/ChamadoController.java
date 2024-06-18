package com.condominios.app.controller;

import com.condominios.app.dto.ChamadoCreateDTO;
import com.condominios.app.model.Chamado;
import com.condominios.app.openapi.ChamadoControllerOpenApi;
import com.condominios.app.repositories.ChamadoRepository;
import com.condominios.app.service.ChamadoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController implements ChamadoControllerOpenApi {

    private ChamadoService chamadoService;
    private ChamadoRepository chamadoRepository;

    @Autowired
    public ChamadoController(ChamadoService chamadoService, ChamadoRepository chamadoRepository) {
        this.chamadoService = chamadoService;
        this.chamadoRepository = chamadoRepository;
    }


    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "criado com sucesso"))
    @PostMapping(path = "/criarChamado")
    public ResponseEntity<Chamado> criarChamado(@Valid @RequestBody Chamado chamadoCreateDTO){
        return ResponseEntity.ok(chamadoService.criarChamado(chamadoCreateDTO));
    }

    @ApiResponses(value = @ApiResponse(responseCode = "200",description = "busca realizada com sucesso"))
    @GetMapping(path = "/buscarChamado")
    public ResponseEntity<List<Chamado>> buscarChamado(){
        return ResponseEntity.ok(chamadoRepository.findAll());
    }
}
