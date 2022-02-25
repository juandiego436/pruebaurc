package com.ruc.prueba.ruc.repository;

import com.ruc.prueba.ruc.entity.Ruc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RucRepository extends CrudRepository<Ruc, Long>{
    
}
