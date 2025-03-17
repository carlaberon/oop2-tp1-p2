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
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30.f, "cocaCola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(50.f, "fPesto", true);
        var platoEntrada = new Plato(20.f, "entrada", false);
        platos.add(platoPrincipal);
        platos.add(platoEntrada);
        var tarjeta = new Visa();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(102.073, costoTotal, 0.1);
    }

    @Test
    public void Test02() { //MASTERCARD
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(20.f, "cocaCola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(20.f, "fPesto", true);
        var platoEntrada = new Plato(20.f, "entrada", false);
        platos.add(platoPrincipal);
        platos.add(platoEntrada);
        var tarjeta = new Mastercard();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(61.388, costoTotal, 0.5); //problema en el calculo
    }

    @Test
    public void Test03() { //COMARCAPLUS
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30.f, "cocaCola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(50.f, "fPesto", true);
        var platoEntrada = new Plato(20.f, "entrada", false);
        platos.add(platoPrincipal);
        platos.add(platoEntrada);
        var tarjeta = new ComarcaPlus();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(100.94, costoTotal, 0.0001);
    }

    @Test
    public void Test04() { //VIEDMA
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30.f, "cocaCola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(50.f, "fPesto", true);
        var platoEntrada = new Plato(20.f, "entrada", false);
        platos.add(platoPrincipal);
        platos.add(platoEntrada);
        var tarjeta = new Viedma();
        Propina propina = Propina.MEDIO;
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(103, costoTotal, 0.0001);

    }
}
