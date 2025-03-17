package org.example;

public class Bebida {
    private float precio;
    private String nombre;

    public Bebida(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public float mostrarPrecio() {
        return precio;
    }

}
