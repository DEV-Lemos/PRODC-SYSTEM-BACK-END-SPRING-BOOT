package com.backend.prodc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.prodc.entities.Receitas;


@Repository
public interface ReceitasRepository extends JpaRepository<Receitas, Long>{
    
}
