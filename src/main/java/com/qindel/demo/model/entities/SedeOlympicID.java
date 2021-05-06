package com.qindel.demo.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public @Data class SedeOlympicID implements Serializable {

    @Column(name = "AÑO")
    private Integer ano;

    @Column(name = "SEDE")
    private Integer sede;
}
