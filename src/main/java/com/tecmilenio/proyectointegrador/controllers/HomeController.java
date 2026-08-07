package com.tecmilenio.proyectointegrador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/datos")
    public String datos() {
        return "datos";
    }
    
    @RequestMapping("/confirmacion")
    public String confirmacion() {
        return "confirmacion";
    }
}