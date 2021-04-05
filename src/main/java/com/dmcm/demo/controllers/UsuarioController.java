package com.dmcm.demo.controllers;

import java.util.ArrayList;

import com.dmcm.demo.models.UsuarioModel;
import com.dmcm.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario") // ruta de usuario
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping() // get desde /usuarios
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping() // post desde /usuarios 
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){ // para obtener datos desde el body de la peticion la hace e tipo UsuarioModel y la guarda
        return this.usuarioService.guardarUsuario(usuario);
    }
    
}
