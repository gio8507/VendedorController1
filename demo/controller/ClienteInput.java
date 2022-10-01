package com.example.demo.controller;

import com.example.demo.domain.Cliente;

public class ClienteInput extends ClienteUpdate{
    private String dni;

    public ClienteInput(String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion);
        this.dni = dni;
    }

    public ClienteInput() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cliente toDomain() {
        return new Cliente(this.nombre, this.apellidos, this.direccion, this.dni);
    }
}

