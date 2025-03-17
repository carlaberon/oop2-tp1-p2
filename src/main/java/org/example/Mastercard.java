package org.example;

public class Mastercard implements Tarjeta {
    @Override
    public double aplicarDescuento(double costoBebidas, double costoPlatos) {
        double costoPlatosDescuento = costoPlatos * 0.98f;
        return costoBebidas + costoPlatosDescuento;
    }
}
