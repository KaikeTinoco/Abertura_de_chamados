package com.condominios.app.enums;

public enum StatusManutencao {
    ATENDIDO("atendido"),
    AUSENTE("ausente");


    private final String descricao;

    StatusManutencao(String descricao) {
        this.descricao = descricao;
    }
}
