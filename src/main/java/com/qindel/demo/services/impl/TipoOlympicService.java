package com.qindel.demo.services.impl;

import com.qindel.demo.model.repositories.ITipoOlympicRepository;
import com.qindel.demo.api.dto.TipoOlympicDto;
import com.qindel.demo.model.entities.TipoOlympicEntity;
import com.qindel.demo.model.mappers.TipoOlympicMapper;
import com.qindel.demo.services.interfaces.ITipoOlympicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.stream.Collectors;
import java.util.List;

@Service
@Transactional
public class TipoOlympicService implements ITipoOlympicService {

    @Autowired
    private ITipoOlympicRepository tipoOlympicRepository;

    @Autowired
    private TipoOlympicMapper tipoOlympicMapper;

    public List<TipoOlympicDto> getTipos(){
        return tipoOlympicRepository.findAll()
                .stream().map(tipoOlympicMapper::toTipoOlympicDto)
                .collect(Collectors.toList());
    }

    public void saveDto(TipoOlympicDto t){ tipoOlympicRepository.save(tipoOlympicMapper.toTipoOlympicEntity(t)); }

    public void saveEntity(TipoOlympicEntity t) {
         tipoOlympicRepository.save(t);
    }

    public void deleteTipoById(Integer id){
        tipoOlympicRepository.deleteById(id);
    }

    public void deleteTipos() {
        tipoOlympicRepository.deleteAll();
    }

}
