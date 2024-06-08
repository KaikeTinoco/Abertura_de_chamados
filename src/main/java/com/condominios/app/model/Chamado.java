package com.condominios.app.model;

import com.condominios.app.enums.LocalOcorrencia;
import com.condominios.app.enums.TipoManutencao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String edificacao;
    private String nomeMorador;
    private String apartementoMorador;
    private String emailMorador;
    private LocalOcorrencia localOcorrencia;
    private TipoManutencao tipoManutencao;
    private String descricao;

}
