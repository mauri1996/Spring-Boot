package com.dmcm.demo.repositories;

import java.util.ArrayList;

import com.dmcm.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRespository extends CrudRepository<UsuarioModel,Long>{
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    public abstract ArrayList<UsuarioModel> findByName(String name);
    public abstract ArrayList<UsuarioModel> findByEmail(String email);    

}
