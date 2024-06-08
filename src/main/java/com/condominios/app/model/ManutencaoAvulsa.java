package com.condominios.app.model;

import com.condominios.app.enums.CategoriaManutencao;
import com.condominios.app.enums.StatusManutencao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ManutencaoAvulsa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Chamado chamado;
    private CategoriaManutencao categoriaManutencao;
    private String conserto;
    private String descricao;
    private String responsavel;
    private LocalDateTime dataConserto;
    private StatusManutencao statusManutencao;
}
