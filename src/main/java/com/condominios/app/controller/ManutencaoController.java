package com.condominios.app.controller;

import com.condominios.app.dto.ManutencaoCreateDTO;
import com.condominios.app.model.ManutencaoAvulsa;
import com.condominios.app.service.ManutencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manutencoes")
public class ManutencaoController {
    private final ManutencaoService manutencaoService;

    @Autowired
    public ManutencaoController(ManutencaoService manutencaoService) {
        this.manutencaoService = manutencaoService;
    }


    @GetMapping("/buscaGeral")
    public ResponseEntity<List<ManutencaoAvulsa>> buscaGeral(){
        return ResponseEntity.ok(manutencaoService.buscaGeral());
    }

    @PostMapping("/cadastroManutencao")
    public ResponseEntity<ManutencaoAvulsa> criarManutencao(@RequestBody ManutencaoCreateDTO dto){
        return ResponseEntity.ok(manutencaoService.criarManutencao(dto));
    }
}
