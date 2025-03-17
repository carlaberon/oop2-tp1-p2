package org.example;

import java.util.List;

public class Dispositivo {

    public double calcularCostoTotal(List<Bebida> bebidas, List<Plato> platos, Tarjeta tarjeta, Propina propina) {
        double costoBebidas = calcularCostoBebida(bebidas);
        double costoPlatos = calcularCostoPlatos(platos);
        double subtotal = costoBebidas + costoPlatos;
        double montoPropina = subtotal * propina.porcentaje();

        return subtotal + montoPropina;
    }

    public double calcularCostoBebida(List<Bebida> bebidas) {
        double costoBebidas = bebidas.stream().mapToDouble(Bebida::mostrarPrecio).sum();
        return costoBebidas;

    }

    public double calcularCostoPlatos(List<Plato> platos) {
        double costoPlato = platos.stream().mapToDouble(Plato::mostrarPrecio).sum();
        return costoPlato;

    }
}
