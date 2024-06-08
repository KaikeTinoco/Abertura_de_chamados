package com.condominios.app.enums;

import lombok.Getter;

@Getter
public enum LocalOcorrencia {

    AREA_COMUM("COMUM"),
    MEU_APARTAMENTO("APARTAMENTO");





    private final String descricao;
     LocalOcorrencia(String descricao){
         this.descricao = descricao;
     }


}

