package com.qindel.demo.model.repositories;

import com.qindel.demo.model.entities.TipoOlympicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoOlympicRepository extends JpaRepository<TipoOlympicEntity, Integer> {
}
