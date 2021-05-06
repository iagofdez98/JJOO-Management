package com.qindel.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class CiudadDto {
    private Integer id;
    private PaisDto pais;
    private String nombre;
    private Integer valor;
}
