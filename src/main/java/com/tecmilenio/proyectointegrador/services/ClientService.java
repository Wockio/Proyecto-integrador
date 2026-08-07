package com.tecmilenio.proyectointegrador.services;

import com.tecmilenio.proyectointegrador.classes.client;
import com.tecmilenio.proyectointegrador.dao.ClientDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    private ClientDAO ClientDAO;
    
    public void guardar(client client) {
        ClientDAO.insertar(client);
    }
}