package com.example.demo.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Coche {
    @NotNull(message = "marca is null")
    @NotBlank(message ="marca is empty" )
    private String marca;
    @NotNull(message = "modelo is null")
    @NotBlank(message = "modelo is null")
    private String modelo;

    private String id;
    private String propietario;
    private boolean reservado;

    public static void addReservado(boolean b) {
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Coche() {

    }


    public Coche(String marca, String modelo, String id, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.propietario = propietario;
        this.reservado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", id=" + id +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}

