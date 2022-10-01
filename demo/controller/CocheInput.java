package com.example.demo.controller;

import com.example.demo.domain.Coche;

public class CocheInput extends CocheUpdate {
    private String id;

    public CocheInput(String marca, String modelo, String id, String propietario) {
        super(marca, modelo, propietario);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CocheInput() {

    }

    public Coche toDomain() {
        return new Coche(this.getMarca(), this.getModelo(), this.getId(), this.getPropietario());
    }

}