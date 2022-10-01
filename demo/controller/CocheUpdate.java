package com.example.demo.controller;

import com.example.demo.domain.Coche;

public class CocheUpdate {
    private String marca;
    private String modelo;
    private String propietario;
    private boolean reservado;

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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public CocheUpdate(String marca, String modelo, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;

    }

    public CocheUpdate() {

    }

    public Coche toDomain(String id) {
        return new Coche(this.getMarca(), this.getModelo(), id, this.getPropietario());
    }
}
