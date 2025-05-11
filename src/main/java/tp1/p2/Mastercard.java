package tp1.p2;

public class Mastercard implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos) {
        float descuentoPlatosPrincipal = (costoPlatos * 0.98f);
        return (costoBebidas + descuentoPlatosPrincipal);
    }
}
