package com.example.demo.controller;



import com.example.demo.domain.Vendedor;

public class VendedorUpdate {
    private String nombre;
    private String apellidos;
    private String direccion;


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


    public VendedorUpdate(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;

    }

    public VendedorUpdate() {

    }

    public Vendedor toDomain(String dni) {
        return new Vendedor(this.getNombre(), this.getApellidos(), this.getDireccion(), dni);

    }
}