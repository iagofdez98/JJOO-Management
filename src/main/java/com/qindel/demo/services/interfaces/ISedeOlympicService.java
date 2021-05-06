package com.qindel.demo.services.interfaces;

import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.api.dto.SedeOlympicDto;
import com.qindel.demo.model.entities.SedeOlympicEntity;
import com.qindel.demo.model.vo.IOlympicGames;

import java.util.List;

public interface ISedeOlympicService {
    List<SedeOlympicDto> getSedes();
    void addSedeOlympic(SedeOlympicDto sedeOlympicDto);
    void saveEntity(SedeOlympicEntity sedeOlympicEntity);
    void deleteSedeOlympicById(CiudadDto ano, Integer id);
    void deleteSedes();
    List<IOlympicGames> getJuegos();
}
