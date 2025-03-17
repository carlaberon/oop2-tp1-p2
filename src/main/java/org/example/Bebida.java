package org.example;

public class Bebida {
    private double precio;
    private String nombre;

    public Bebida(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double mostrarPrecio() {
        return precio;
    }

}
