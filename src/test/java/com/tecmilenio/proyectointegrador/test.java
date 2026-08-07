package com.tecmilenio.proyectointegrador;

import com.tecmilenio.proyectointegrador.classes.client;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class test {

    @Test
    void testContacto() {

        client client = new client();

        client.setContacto("1234567890");
        
        assertEquals("1234567890", client.getContacto());
    }
}