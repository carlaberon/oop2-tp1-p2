package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispositivoTest {

    @Test
    public void Test01() {
        //Cálculo de costo con tarjeta Visa
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30, "cocacola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(25, "fPesto");
        platos.add(platoPrincipal);
        var tarjeta = new Visa();
        Propina propina = Propina.MEDIO;
        //excersice
        double costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(56.65, costoTotal, 0.1); //delta
    }

    @Test
    public void Test02() {
        //Cálculo de costo con tarjeta Mastercard.
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30, "cocacola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(25, "fPesto");
        platos.add(platoPrincipal);
        var tarjeta = new Mastercard();
        Propina propina = Propina.MEDIO;
        //excersice
        double costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(56.1349999634549, costoTotal, 0.1);
    }

    @Test
    public void Test03() {
        //Cálculode costo con tarjeta Comarca Plus
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30, "cocacola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(25, "fPesto");
        platos.add(platoPrincipal);
        var tarjeta = new ComarcaPlus();
        Propina propina = Propina.MEDIO;
        //excersice
        double costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(55.517001535512506, costoTotal, 0.0);
    }

    @Test
    public void Test04() {
        //Cálculo de costo con tarjeta Viedma
        //setup
        var dispositivo = new Dispositivo();
        List<Bebida> bebidas = new ArrayList<>();
        List<Plato> platos = new ArrayList<>();
        var gaseosa = new Bebida(30, "cocacola");
        bebidas.add(gaseosa);
        var platoPrincipal = new Plato(25, "fPesto");
        platos.add(platoPrincipal);
        var tarjeta = new Viedma();
        Propina propina = Propina.MEDIO;
        //excersice
        double costoTotal = dispositivo.calcularCostoTotal(bebidas, platos, tarjeta, propina);
        //verify
        assertEquals(56.65, costoTotal, 0.0);

    }
}
