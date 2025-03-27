package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    LocalDateTime fechaPedido;
    private List<Float> platos;
    private List<Float> bebidas;
    private int numeroDeMesa;
    private ProveedorDeFechas proveedor;

    public Pedido(List<Float> platos, List<Float> bebidas, int numeroDeMesa, ProveedorDeFechas proveedor) {
        this.proveedor = proveedor;
        this.bebidas = bebidas;
        this.platos = platos;
        this.numeroDeMesa = numeroDeMesa;
        this.fechaPedido = this.proveedor.fecha();
    }

    public float costoBebidas() {
        float costoBebidas = 0.0f;
        for (Float bebida : this.bebidas) {
            costoBebidas += bebida;
        }
        return costoBebidas;
    }

    public float costoPlatos() {
        float costoPlatos = 0.0f;
        for (Float plato : this.platos) {
            costoPlatos += plato;
        }
        return costoPlatos;
    }

    public LocalDateTime fechaPedido() {
        return this.fechaPedido;
    }
}
