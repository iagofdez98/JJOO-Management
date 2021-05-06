package com.qindel.demo.services.impl;

import com.qindel.demo.api.dto.PaisDto;
import com.qindel.demo.model.mappers.PaisMapper;
import com.qindel.demo.model.repositories.ICiudadRepository;
import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.model.entities.CiudadEntity;
import com.qindel.demo.model.mappers.CiudadMapper;
import com.qindel.demo.services.interfaces.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CiudadService implements ICiudadService {

    @Autowired
    private ICiudadRepository ciudadRepository;

    @Autowired
    private CiudadMapper ciudadMapper;

    public List<CiudadDto> getSedes(){
        return ciudadRepository.findAll()
                .stream().map(ciudadMapper::toCiudadDto)
                .collect(Collectors.toList());
    }

    public void saveDto(CiudadDto s){
        ciudadRepository.save(ciudadMapper.toCiudadEntity(s));
    }

    public void saveEntity(CiudadEntity s){
        ciudadRepository.save(s);
    }

    public void deleteCiudadById(Integer id){
        ciudadRepository.deleteById(id);
    }

    public void deleteCiudades() {
        ciudadRepository.deleteAll();
    }
}
