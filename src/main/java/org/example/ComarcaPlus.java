package org.example;

public class ComarcaPlus implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos, float costoPlatosPrincipal) {
        return (costoBebidas + costoPlatos + costoPlatosPrincipal) * 0.98f;
    }
}
