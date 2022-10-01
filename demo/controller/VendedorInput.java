package com.example.demo.controller;

import com.example.demo.domain.Vendedor;

public class VendedorInput extends VendedorUpdate {
    private String dni;

    public VendedorInput(String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion);
        this.dni = dni;
    }


    public VendedorInput(String dni) {
        this.dni = dni;
    }



    public VendedorInput() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Vendedor toDomain() {
        return new Vendedor(this.getNombre(), this.getApellidos(), this.getDireccion(), this.getDni());
    }


}

