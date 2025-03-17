package org.example;

public class Visa implements Tarjeta {

    @Override
    public double aplicarDescuento(double costoBebidas, double costoPlatos) {
        return costoPlatos + (costoBebidas * 0.97f);
    }
}
