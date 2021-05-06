package com.qindel.demo.model.mappers;

import com.qindel.demo.api.dto.PaisDto;
import com.qindel.demo.model.entities.PaisEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {CiudadMapper.class},
        componentModel = "spring")
public interface PaisMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "codigo", target = "codigo")
    @Mapping(source = "valor", target = "valor")
//    @Mapping(source = "ciudades", target = "ciudades")
    PaisDto toPaisDto(PaisEntity p);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "codigo", target = "codigo")
    @Mapping(source = "valor", target = "valor")
//    @Mapping(source = "ciudades", target = "ciudades")
    PaisEntity toPaisEntity(PaisDto p);
}
