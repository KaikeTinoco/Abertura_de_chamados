package com.condominios.app.dto;

import com.condominios.app.enums.CategoriaManutencao;
import com.condominios.app.enums.StatusManutencao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ManutencaoCreateDTO {
    private Long idChamado;
    private CategoriaManutencao categoriaManutencao;
    private String conserto;
    private String descricao;
    private String responsavel;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dataConserto;

    private StatusManutencao statusManutencao;
}
