package com.qindel.demo.model.mappers;

import com.qindel.demo.api.dto.SedeOlympicDto;
import com.qindel.demo.model.entities.SedeOlympicEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = {TipoOlympicMapper.class, CiudadMapper.class})
public interface SedeOlympicMapper {

    @Mapping(source = "id.ano", target = "ano")
    @Mapping(source = "id.sede", target = "idSede")
    @Mapping(source = "sedeEntity", target = "sede")
    @Mapping(source = "tipo", target = "tipo")
    SedeOlympicDto toSedeOlympicDto (SedeOlympicEntity s);

    @Mapping(source = "ano", target = "id.ano")
    @Mapping(source = "idSede", target = "id.sede")
    @Mapping(source = "sede", target = "sedeEntity")
    @Mapping(source = "tipo", target = "tipo")
    SedeOlympicEntity toSedeOlympicEntity(SedeOlympicDto s);

}
