package tp1.p2;

public class ComarcaPlus implements TarjetaDeCredito {
    @Override
    public float aplicarDescuento(float costoBebidas, float costoPlatos) {
        return (costoBebidas + costoPlatos) * 0.98f;
    }
}
