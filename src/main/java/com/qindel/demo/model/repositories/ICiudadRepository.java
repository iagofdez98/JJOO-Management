package com.qindel.demo.model.repositories;

import com.qindel.demo.model.entities.CiudadEntity;
import com.qindel.demo.model.entities.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICiudadRepository extends JpaRepository<CiudadEntity, Integer> {

    List<CiudadEntity> findCiudadEntitiesByPais(PaisEntity p);
}
