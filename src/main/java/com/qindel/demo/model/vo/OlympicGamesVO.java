package com.qindel.demo.model.vo;

import lombok.Data;

public @Data class OlympicGamesVO{

    private int idPais;
    private String nombrePais;
    private Integer idCiudad;
    private String nombreCiudad;
    private int valor;
    private String descripcion;
    private int veces;
}
