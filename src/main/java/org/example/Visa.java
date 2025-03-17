package org.example;

public class Visa implements TarjetaDeCredito {

    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos, float costoPlatosPrincipal) {
        float descuentoBebida = costoBebidas * 0.97f;
        return (costoPlatos + descuentoBebida + costoPlatosPrincipal);
    }
}
