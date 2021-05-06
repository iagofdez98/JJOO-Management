package com.qindel.demo.ws.controllers;

import com.qindel.demo.api.dto.CiudadDto;
import com.qindel.demo.api.dto.SedeOlympicDto;
import com.qindel.demo.model.vo.IOlympicGames;
import com.qindel.demo.services.interfaces.ISedeOlympicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sedes")
public class SedeOlympicController {

    @Autowired
    private ISedeOlympicService service;

    @GetMapping("/agrupacion")
    List<IOlympicGames> juegos(){
        return service.getJuegos();
    }

    @GetMapping
    List<SedeOlympicDto> getSedes(){
        return service.getSedes();
    }

    @PostMapping
    void addSedeOlympic(@RequestBody SedeOlympicDto ol){
        service.addSedeOlympic(ol);
    }

    @DeleteMapping("/{id}")
    void deleteSedeOlympic(CiudadDto ciudad, Integer ano){
        service.deleteSedeOlympicById(ciudad, ano);
    }

    @DeleteMapping("/deleteAll")
    void deleteSedeOlympic(){
        service.deleteSedes();
    }
}
