package com.example.practicaobligatoria;

public class Usuario {

    String nombre;
    String Apellidos;
    String clave;


    public Usuario(String nombre, String apellidos,String clave,) {
        this.nombre = nombre;
        this.Apellidos = apellidos;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
