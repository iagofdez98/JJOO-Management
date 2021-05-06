package com.qindel.demo.services.interfaces;

import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.model.entities.CiudadEntity;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ICiudadService {
    List<CiudadDto> getSedes();
    void saveDto(CiudadDto s);
    void saveEntity(CiudadEntity s);
    void deleteCiudadById(Integer id);
    void deleteCiudades();
}
