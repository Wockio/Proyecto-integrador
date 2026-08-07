package com.tecmilenio.proyectointegrador.controllers;

import com.tecmilenio.proyectointegrador.classes.client;
import com.tecmilenio.proyectointegrador.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("confirmacion")
public class ClientController {

    @Autowired
    private ClientService ClientService;
    
    @PostMapping
    public String guardarClient(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("sexo") String sexo,
            @RequestParam("edad") int edad,
            @RequestParam("padecimiento") String padecimiento,
            @RequestParam("contacto") String contacto) {
        
        client client = new client();
        
        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setSexo(sexo);
        client.setEdad(edad);
        client.setPadecimiento(padecimiento);
        client.setContacto(contacto);

        ClientService.guardar(client);

        return "confirmacion";
    }
}