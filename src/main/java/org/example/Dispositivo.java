package org.example;

public class Dispositivo {

    private RegistroPedidos registroPedidos;

    public float calcularCostoTotal(Pedido pedido, TarjetaDeCredito tarjeta, Propina propina, RegistroPedidos registroPedidos) {

        float costoBebidas = pedido.costoBebidas();
        float costoPlatos = pedido.costoPlatos();
        float descuento = tarjeta.aplicarDescuento(costoBebidas, costoPlatos);
        float montoPropina = (descuento * propina.porcentaje());
        registroPedidos.registrarPedido(pedido.fechaPedido, (descuento + montoPropina));
        return (descuento + montoPropina);
    }

}
