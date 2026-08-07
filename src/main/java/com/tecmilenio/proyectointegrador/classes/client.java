package com.tecmilenio.proyectointegrador.classes;

public class client {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String padecimiento;
    private String contacto;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }  
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  
   
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getPadecimiento() {
        return padecimiento;
    }
    
    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }  
    
    public String getContacto() {
        return contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }  
}