package tp1.p2;

public class Visa implements TarjetaDeCredito {

    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos) {
        float descuentoBebida = costoBebidas * 0.97f;
        return (costoPlatos + descuentoBebida);
    }
}
