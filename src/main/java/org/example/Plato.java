package org.example;

public class Plato {
    private float precio;
    private String nombre;
    private boolean principal;

    public Plato(float precio, String nombre, Boolean esPrincipal) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public float mostrarPrecio() {
        return precio;
    }

    public boolean esPrincipal() {
        return this.principal;
    }
}
