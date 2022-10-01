package com.example.demo.controller;

import com.example.demo.domain.Cliente;


public class ClienteUpdate {
    protected String nombre;
    protected String apellidos;
    protected String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public ClienteUpdate(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;

    }

    public ClienteUpdate() {

    }

    public Cliente toDomain(String dni) {
        return new Cliente(this.getNombre(), this.getApellidos(), this.getDireccion(), dni);

    }
}

