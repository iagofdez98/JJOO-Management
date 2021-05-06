package com.qindel.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class SedeOlympicDto {

    private Integer ano;
    private Integer idSede;
    private CiudadDto sede;
    private TipoOlympicDto tipo;
}
