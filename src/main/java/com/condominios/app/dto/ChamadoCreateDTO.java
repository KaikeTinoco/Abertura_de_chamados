package com.condominios.app.dto;

import com.condominios.app.enums.LocalOcorrencia;
import com.condominios.app.enums.TipoManutencao;

public class ChamadoCreateDTO {
    private String edificacao;
    private String nomeMorador;
    private String apartementoMorador;
    private String emailMorador;
    private LocalOcorrencia localOcorrencia;
    private TipoManutencao tipoManutencao;
    private String descricao;
}
