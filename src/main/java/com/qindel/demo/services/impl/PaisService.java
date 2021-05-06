package com.qindel.demo.services.impl;

import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.model.entities.CiudadEntity;
import com.qindel.demo.model.mappers.CiudadMapper;
import com.qindel.demo.model.repositories.IPaisRepository;
import com.qindel.demo.api.dto.PaisDto;
import com.qindel.demo.model.entities.PaisEntity;
import com.qindel.demo.model.mappers.PaisMapper;
import com.qindel.demo.services.interfaces.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class PaisService implements IPaisService {

    @Autowired
    private IPaisRepository paisRepository;

    @Autowired
    private PaisMapper paisMapper;

    public List<PaisDto> getPaises(){
        return paisRepository.findAll()
                .stream().map(paisMapper::toPaisDto)
                .collect(Collectors.toList());
    }

    public void saveDto(PaisDto p){
        paisRepository.save(paisMapper.toPaisEntity(p));
    }

    public void saveEntity(PaisEntity p){ paisRepository.save(p);}

    public void deletePaisById(Integer id){
        paisRepository.deleteById(id);
    }

    public void deletePaises() {
        paisRepository.deleteAll();
    }
}
