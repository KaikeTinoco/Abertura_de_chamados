package com.condominios.app.model;

import com.condominios.app.enums.LocalOcorrencia;
import com.condominios.app.enums.TipoManutencao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "o campo edificacao não pode estar nulo")
    @NotBlank(message = "o campo edificaco não pode estar vazio")
    private String edificacao;

    @NotNull(message = "o campo nomeMorador não pode estar nulo")
    @NotBlank(message = "o campo nomeMorador não pode estar vazio")
    private String nomeMorador;

    @NotNull(message = "o campo apartamentoMorador não pode estar nulo")
    @NotBlank(message = "o campo apartaementoMorador não pode estar vazio")
    private String apartementoMorador;

    @Email(message = "por favor digite um email válido")
    @NotNull(message = "o campo emailMorador não pode estar nulo")
    @NotBlank(message = "o campo emailMorador não pode estar vazio")
    private String emailMorador;

    @NotNull(message = "o campo localOcorrencia não pode estar nulo")
    private LocalOcorrencia localOcorrencia;

    @NotNull(message = "o campo tipoManutencao não pode estar nulo")
    private TipoManutencao tipoManutencao;

    @NotNull(message = "o campo descricao não pode estar nulo")
    @NotBlank(message = "o campo descricao não pode estar vazio")
    private String descricao;

}
