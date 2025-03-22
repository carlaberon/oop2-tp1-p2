package org.example;

public class Dispositivo {

    private RegistroPedidos registroPedidos;

    public float calcularCostoTotal(Pedido pedido, TarjetaDeCredito tarjeta, Propina propina) {

        float costoBebidas = pedido.costoBebidas();
        float costoPlatos = pedido.costoPlatos();
        float descuento = tarjeta.aplicarDescuento(costoBebidas, costoPlatos);
        float montoPropina = (descuento * propina.porcentaje());
        return (descuento + montoPropina);
    }

}
