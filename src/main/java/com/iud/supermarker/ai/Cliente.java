package com.iud.supermarker.ai;


public class Cliente {
    private String nombre;
    private int id;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
