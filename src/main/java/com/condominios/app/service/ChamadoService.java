package com.condominios.app.service;

import com.condominios.app.dto.ChamadoCreateDTO;
import com.condominios.app.dto.ChamadoMapper;
import com.condominios.app.model.Chamado;
import com.condominios.app.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {
    private final ChamadoRepository chamadoRepository;

    private final ChamadoMapper chamadoMapper;

    @Autowired
    public ChamadoService(ChamadoRepository chamadoRepository,ChamadoMapper chamadoMapper) {
        this.chamadoRepository = chamadoRepository;
        this.chamadoMapper = chamadoMapper;
    }

    public Chamado criarChamado(Chamado chamado) {
        //Chamado chamado = chamadoMapper.toChamado(chamadoCreateDTO);
        chamadoRepository.save(chamado);
        return chamado;
    }
}
