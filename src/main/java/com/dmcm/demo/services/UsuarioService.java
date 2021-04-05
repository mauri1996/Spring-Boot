package com.dmcm.demo.services;

import java.util.ArrayList;

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
    
}
