package com.qindel.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public @Data class TipoOlympicDto {
    private Integer id;
    private String tipo;
}
