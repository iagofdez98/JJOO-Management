package com.qindel.demo.services.interfaces;

import com.qindel.demo.api.dto.TipoOlympicDto;
import com.qindel.demo.model.entities.TipoOlympicEntity;

import java.util.List;

public interface ITipoOlympicService {
    List<TipoOlympicDto> getTipos();
    void saveDto(TipoOlympicDto tipoOlympicDto);
    void saveEntity(TipoOlympicEntity tipoOlympicEntity);
    void deleteTipoById(Integer id);
    void deleteTipos();
}
