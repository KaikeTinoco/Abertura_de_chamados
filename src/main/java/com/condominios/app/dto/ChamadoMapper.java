package com.condominios.app.dto;

import com.condominios.app.model.Chamado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Setter
@Getter
@Component
public class ChamadoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Chamado toChamado(ChamadoCreateDTO dto){
         Chamado chamado = modelMapper.map(dto, Chamado.class);
         return chamado;
    }

}
