package com.tecmilenio.proyectointegrador.dao;

import com.tecmilenio.proyectointegrador.classes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertar(user user) {

        String sql = "INSERT INTO users(Usuario, Contrasena)"
                + "VALUES (?,?)";

        jdbcTemplate.update(
            sql,
            user.getUsuario(),
            user.getContrasena()
        );
    }
}