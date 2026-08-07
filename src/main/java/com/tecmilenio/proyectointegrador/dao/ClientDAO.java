package com.tecmilenio.proyectointegrador.dao;

import com.tecmilenio.proyectointegrador.classes.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertar(client client) {

        String sql = "INSERT INTO clients(Nombre, Apellido, Sexo, Edad, Padecimiento, Contacto)"
                + "VALUES (?,?,?,?,?,?)";

        jdbcTemplate.update(
            sql,
            client.getNombre(),
            client.getApellido(),
            client.getSexo(),
            client.getEdad(),
            client.getPadecimiento(),
            client.getContacto()
        );
    }
}