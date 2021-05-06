package com.qindel.demo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public @Data class PaisDto {
    private Integer id;
    private String nombre;
    private String codigo;
    private int valor;
//    private List<CiudadDto> ciudades;

}
