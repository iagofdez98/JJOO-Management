package com.qindel.demo.services.interfaces;

import com.qindel.demo.api.dto.PaisDto;
import com.qindel.demo.model.entities.PaisEntity;

import java.util.List;

public interface IPaisService {
    List<PaisDto> getPaises();

    void saveDto(PaisDto paisDto);

    void saveEntity(PaisEntity paisEntity);

    void deletePaisById(Integer id);

    void deletePaises();
}
