package com.qindel.demo.model.mappers;


import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.model.entities.CiudadEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = PaisMapper.class, componentModel = "spring")
public interface CiudadMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "pais", target = "pais")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "valor", target = "valor")
    CiudadDto toCiudadDto(CiudadEntity c);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "pais", target = "pais")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "valor", target = "valor")
    CiudadEntity toCiudadEntity(CiudadDto c);
}
