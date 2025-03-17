package org.example;

public class ComarcaPlus implements Tarjeta {
    @Override
    public double aplicarDescuento(double costoBebidas, double costoPlatos) {
        return (costoBebidas + costoPlatos) * 0.98f;
    }
}
