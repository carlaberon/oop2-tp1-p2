package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispositivoTest {

    @Test
    public void Test01() {  //VISA
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1);
        var tarjeta = new Visa();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina);
        //verify
        assertEquals(15.2955, costoTotal, 0.1);
    }

    @Test
    public void Test02() {  //MASTERCARD
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1);
        var tarjeta = new Mastercard();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina);
        //verify
        assertEquals(15.244, costoTotal, 0.1);
    }

    @Test
    public void Test03() {  //COMARCA PLUS
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1);
        var tarjeta = new ComarcaPlus();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina);
        //verify
        assertEquals(15.141, costoTotal, 0.1);
    }

    @Test
    public void Test04() {  //VIEDMA
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1);
        var tarjeta = new TarjetaSinDescuento();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina);
        //verify
        assertEquals(15.45, costoTotal, 0.1);
    }

}
