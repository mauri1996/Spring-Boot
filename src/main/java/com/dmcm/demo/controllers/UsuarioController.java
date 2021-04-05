package com.dmcm.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.dmcm.demo.models.UsuarioModel;
import com.dmcm.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios") // ruta de usuarios
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
    
    @GetMapping(path = "/search/{id}") // get desde /usuarios/search/numeroDeUsuario
    public Optional <UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){ // obtiene valor de is del path
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(path = "/querry") // get desde /usuarios/querry?prioridad=numeroDePrioridad
    public ArrayList<UsuarioModel> obtenerUsuariosPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return usuarioService.obtenerPorPrioridad(prioridad);
    }

    // @GetMapping(path = "/querry") // get desde /usuarios/querry?name=nombre
    // public ArrayList<UsuarioModel> obtenerUsuariosPorName(@RequestParam("name") String name){
    //     return usuarioService.obtenerPorName(name);
    // }

    // @GetMapping(path = "/querry") // get desde /usuarios/querry?email=Correo
    // public ArrayList<UsuarioModel> obtenerUsuariosPorEmail(@RequestParam("email") String email){
    //     return usuarioService.obtenerPorName(email);
    // }

    @DeleteMapping(path = "/{id}") // metodo delete
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Usuario Eliminado con id " + id;
        }else{
            return "No se pudo eliminar usuario con id " + id;
        }
    
    }
    
}
