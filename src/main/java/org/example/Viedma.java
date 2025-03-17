package org.example;

public class Viedma implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos, float costoPlatosPrincipal) {

        return (costoBebidas + costoPlatos + costoPlatosPrincipal);
    }
}
