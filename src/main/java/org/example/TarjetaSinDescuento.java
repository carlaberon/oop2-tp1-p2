package org.example;

public class TarjetaSinDescuento implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos) {

        return (costoBebidas + costoPlatos);
    }
}
