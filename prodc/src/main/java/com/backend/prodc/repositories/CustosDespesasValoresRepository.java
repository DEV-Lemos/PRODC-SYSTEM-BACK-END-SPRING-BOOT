package com.backend.prodc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.prodc.entities.CustosDespesasValores;

@Repository
public interface CustosDespesasValoresRepository extends JpaRepository<CustosDespesasValores, Long> {

}
