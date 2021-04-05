package com.dmcm.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.dmcm.demo.models.UsuarioModel;
import com.dmcm.demo.repositories.UsuarioRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRespository usuarioRespository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRespository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRespository.save(usuario);
    }
    
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRespository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return (ArrayList<UsuarioModel>) usuarioRespository.findByPrioridad(prioridad);
    }

    public ArrayList<UsuarioModel> obtenerPorName(String name){
        return (ArrayList<UsuarioModel>) usuarioRespository.findByName(name);
    }

    public ArrayList<UsuarioModel> obtenerPorEmail(String email){
        return (ArrayList<UsuarioModel>) usuarioRespository.findByEmail(email);
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRespository.deleteById(id);
            return true;
        }catch(Exception error){
            return false;
        }
    }
}
