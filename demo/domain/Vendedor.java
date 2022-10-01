package com.example.demo.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

public class Vendedor {
    @NotNull(message = "nombre is null")
    @NotBlank(message = "nombre is empty")
    private String nombre;
    @NotNull(message = "apellido is null")
    @NotBlank(message = "apellido is empty")
    private String apellidos;
    @NotNull(message = "direccion is null")
    @NotBlank(message = "direccion is empty")
    private String direccion;
    @NotNull(message = "dni is null")
    @NotBlank(message = "dni is empty")
    private String dni;

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Vendedor(String nombre, String apellidos, String direccion, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
    }

    public Vendedor() {

    }

}