package com.tecmilenio.proyectointegrador.controllers;

import com.tecmilenio.proyectointegrador.classes.user;
import com.tecmilenio.proyectointegrador.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("datos")
public class UserController {

    @Autowired
    private UserService UserService;
    
    @PostMapping
    public String guardarUser(
            @RequestParam("usuario") String usuario,
            @RequestParam("contrasena") String contrasena) {

        user user = new user();
        
        user.setUsuario(usuario);
        user.setContrasena(contrasena);

        UserService.guardar(user);

        return "datos";
    }
}