package com.condominios.app.service;

import com.condominios.app.dto.ManutencaoCreateDTO;
import com.condominios.app.model.ManutencaoAvulsa;
import com.condominios.app.repositories.ChamadoRepository;
import com.condominios.app.repositories.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManutencaoService {
    private final ManutencaoRepository manutencaoRepository;
    private final ChamadoRepository chamadoRepository;


    @Autowired
    public ManutencaoService(ManutencaoRepository manutencaoRepository, ChamadoRepository chamadoRepository) {
        this.manutencaoRepository = manutencaoRepository;
        this.chamadoRepository = chamadoRepository;
    }

    public List<ManutencaoAvulsa> buscaGeral() {
        return manutencaoRepository.findAll();
    }

    public ManutencaoAvulsa criarManutencao(ManutencaoCreateDTO dto) {
        ManutencaoAvulsa manutencaoAvulsa = new ManutencaoAvulsa();
        manutencaoAvulsa.setChamado(chamadoRepository.findById(dto.getIdChamado()).get());
        manutencaoAvulsa.setCategoriaManutencao(dto.getCategoriaManutencao());
        manutencaoAvulsa.setStatusManutencao(dto.getStatusManutencao());
        manutencaoAvulsa.setDescricao(dto.getDescricao());
        manutencaoAvulsa.setConserto(dto.getConserto());
        manutencaoAvulsa.setResponsavel(dto.getResponsavel());
        manutencaoAvulsa.setDataConserto(dto.getDataConserto());
        manutencaoRepository.save(manutencaoAvulsa);

        return manutencaoAvulsa;
    }
}
