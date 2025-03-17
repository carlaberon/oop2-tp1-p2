package org.example;

public class Mastercard implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos, float costoPlatosPrincipal) {
        float descuentoPlatosPrincipal = (costoPlatosPrincipal * 0.98f);
        return (costoBebidas + costoPlatos + descuentoPlatosPrincipal);
    }
}
