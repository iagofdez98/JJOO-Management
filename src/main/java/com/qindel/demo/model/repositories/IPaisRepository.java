package com.qindel.demo.model.repositories;

import com.qindel.demo.model.entities.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends JpaRepository<PaisEntity, Integer> {

}