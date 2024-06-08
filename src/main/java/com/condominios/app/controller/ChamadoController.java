package com.condominios.app.controller;

import com.condominios.app.dto.ChamadoCreateDTO;
import com.condominios.app.model.Chamado;
import com.condominios.app.repositories.ChamadoRepository;
import com.condominios.app.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private ChamadoService chamadoService;
    private ChamadoRepository chamadoRepository;

    @Autowired
    public ChamadoController(ChamadoService chamadoService, ChamadoRepository chamadoRepository) {
        this.chamadoService = chamadoService;
        this.chamadoRepository = chamadoRepository;
    }


    @PostMapping(path = "/criarChamado")
    public ResponseEntity<Chamado> criarChamado(@RequestBody Chamado chamadoCreateDTO){
        return ResponseEntity.ok(chamadoService.criarChamado(chamadoCreateDTO));
    }

    @GetMapping(path = "/buscarChamado")
    public ResponseEntity<List<Chamado>> buscarChamado(){
        return ResponseEntity.ok(chamadoRepository.findAll());
    }
}
