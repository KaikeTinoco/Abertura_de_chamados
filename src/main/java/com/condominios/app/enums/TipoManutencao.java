package com.condominios.app.enums;
import lombok.Getter;


@Getter
public enum TipoManutencao {
    ELETRICA("ELETRICA"),
    HIDRAULICA("HIDRAULICA"),
    ACABAMENTOS("ACABAMENTOS"),
    GAS("GAS"),
    MECANICA("MECANICA");



    private final String descricao;

    TipoManutencao(String descricao) {
        this.descricao = descricao;
    }
}
