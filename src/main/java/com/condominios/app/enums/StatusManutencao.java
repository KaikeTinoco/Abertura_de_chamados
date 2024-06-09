package com.condominios.app.enums;

public enum StatusManutencao {
    ATENDIDO("ATENDIDO"),
    AUSENTE("AUSENTE");


    private final String descricao;

    StatusManutencao(String descricao) {
        this.descricao = descricao;
    }
}
