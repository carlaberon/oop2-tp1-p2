package org.example;

import java.util.List;

public class Dispositivo {

    public float calcularCostoTotal(List<Bebida> bebidas, List<Plato> platos, TarjetaDeCredito tarjeta, Propina propina) {

        float costoBebidas = calcularCostoBebida(bebidas);
        float costoPlatos = calcularCostoPlatos(platos);
        float costoPlatosPrincipal = calcularCostoPlatosPrincipal(platos);
        float descuento = tarjeta.aplicarDescuento(costoBebidas, costoPlatos, costoPlatosPrincipal);
        float montoPropina = (descuento * propina.porcentaje());
        return (descuento + montoPropina);
    }

    public float calcularCostoBebida(List<Bebida> bebidas) {
        float costoBebidas = 0.0f;
        for (Bebida bebida : bebidas) {
            costoBebidas += bebida.mostrarPrecio();
        }
        return costoBebidas;

    }

    public float calcularCostoPlatos(List<Plato> platos) {
        float costoPlatos = 0.0f;
        for (Plato plato : platos) {
            if (!plato.esPrincipal()) {
                costoPlatos += plato.mostrarPrecio();
            }
        }
        return costoPlatos;
    }

    public float calcularCostoPlatosPrincipal(List<Plato> platos) {
        float costoPlatosPrincipal = 0.0f;
        for (Plato plato : platos) {
            if (plato.esPrincipal()) {
                costoPlatosPrincipal += plato.mostrarPrecio();
            }
        }
        return costoPlatosPrincipal;
    }
}
