package com.condominios.app.enums;

public enum CategoriaManutencao {
    ESTRUTURA("ESTRUTURA"),
    IPERMEABILIZACAO("IPERMEABILIZACAO"),
    PINTURAS("PINTURAS"),
    SEGURANCA("SEGURANCA"),
    AREA_COMUM("AREACOMUM"),
    ACESSIBILIDADE("ACESSIBILIDADE"),
    SUSTENTABILIDADE("SUSTENTABILIDADE"),
    ZELADORIA("ZELADORIA"),
    COMUNICACAO("COMUNICACAO");



    private final String descricao;

    CategoriaManutencao(String descricao) {
        this.descricao = descricao;
    }
}
