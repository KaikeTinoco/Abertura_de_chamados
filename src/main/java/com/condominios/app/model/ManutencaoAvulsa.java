package com.condominios.app.model;

import com.condominios.app.enums.CategoriaManutencao;
import com.condominios.app.enums.StatusManutencao;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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

    @ManyToOne
    @NotNull(message = "o campo chamado não deve estar nulo")
    private Chamado chamado;

    @NotNull(message = "o campo categoria manutencao não deve estar nulo")
    private CategoriaManutencao categoriaManutencao;

    @NotNull(message = "o campo conserto não deve estar nulo")
    @NotBlank(message = "o campo conserto não deve estar vazio")
    private String conserto;

    @NotNull(message = "o campo descricao não deve estar nulo")
    @NotBlank(message = "o campo descricao não deve estar vazio")
    private String descricao;

    @NotNull(message = "o campo responsavel não deve estar nulo")
    @NotBlank(message = "o campo responsavel não deve estar vazio")
    private String responsavel;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @NotNull(message = "o campo dataConserto não deve estar nulo")
    private LocalDateTime dataConserto;

    @NotNull(message = "o campo statusManutencao não deve estar nulo")
    private StatusManutencao statusManutencao;
}
