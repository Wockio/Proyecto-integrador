package com.tecmilenio.proyectointegrador.controllers;

import com.tecmilenio.proyectointegrador.classes.user;
import com.tecmilenio.proyectointegrador.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
@RequestMapping("datos")
public class UserController {

    @Autowired
    private UserService UserService;
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    @PostMapping
    public String guardarUser(
            @RequestParam("usuario") String usuario,
            @RequestParam("contrasena") String contrasena) {

        user user = new user();
        
        user.setUsuario(usuario);
        String passwordHash = encoder.encode(contrasena);
        user.setContrasena(passwordHash);

        UserService.guardar(user);

        return "datos";
    }
}