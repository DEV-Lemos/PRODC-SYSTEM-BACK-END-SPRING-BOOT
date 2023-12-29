package com.backend.prodc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.prodc.entities.CustosDespesas;

@Repository
public interface CustosDespesasRepository extends JpaRepository<CustosDespesas, Long> {

}
