package org.example;

public class Plato {
    private double precio;
    private String nombre;

    public Plato(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double mostrarPrecio() {
        return precio;
    }
}
