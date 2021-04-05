package com.dmcm.demo.repositories;

import com.dmcm.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRespository extends CrudRepository<UsuarioModel,Long>{
    
}
