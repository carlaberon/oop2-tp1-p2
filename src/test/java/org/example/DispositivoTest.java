package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DispositivoTest {

    @Test
    public void Test01() {  //VISA
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1, new ProveedorDeFechasFake());
        var tarjeta = new Visa();
        Propina propina = Propina.MEDIO;
//        RegistroPedidos registroPedidos = new ArchivoDePedidos("F:\\proyectos\\sistemas\\materias2025\\primer cuatrimestre\\orientacion a objetos II\\carpeta\\registroPedidos.txt");
        String pathFake = "";
        var registroPedidos = new RegistroPedidosFake(pathFake);
        String esperado = "27/03/2027 || 15.295501\n";

        //verify
        //++ comprobar que registroPedidoFake esté bien programado ++//
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina, registroPedidos);
        //verify
        assertEquals(15.2955, costoTotal, 0.1);
        assertEquals(esperado.replace("\n", System.lineSeparator()), registroPedidos.data());
        assertTrue(registroPedidos.startWith("27/03/2027"));
    }

    @Test
    public void Test02() {  //MASTERCARD
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1, new ProveedorDeFechasFake());
        var tarjeta = new Mastercard();
        Propina propina = Propina.MEDIO;
//        RegistroPedidos registroPedidos = new ArchivoDePedidos("F:\\proyectos\\sistemas\\materias2025\\primer cuatrimestre\\orientacion a objetos II\\carpeta\\registroPedidos.txt");
        String pathFake = "";
        var registroPedidos = new RegistroPedidosFake(pathFake);
        String esperado = "27/03/2027 || 15.244\n";
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina, registroPedidos);
        //verify
        assertEquals(15.244, costoTotal, 0.1);
        assertEquals(esperado.replace("\n", System.lineSeparator()), registroPedidos.data());
        assertTrue(registroPedidos.startWith("27/03/2027"));
    }

    @Test
    public void Test03() {  //COMARCA PLUS
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1, new ProveedorDeFechasFake());
        var tarjeta = new ComarcaPlus();
        Propina propina = Propina.MEDIO;
//        RegistroPedidos registroPedidos = new ArchivoDePedidos("F:\\proyectos\\sistemas\\materias2025\\primer cuatrimestre\\orientacion a objetos II\\carpeta\\registroPedidos.txt");
        String pathFake = "";
        var registroPedidos = new RegistroPedidosFake(pathFake);
        String esperado = "27/03/2027 || 15.141001\n";
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina, registroPedidos);
        //verify
        assertEquals(15.141, costoTotal, 0.1);
        assertEquals(esperado.replace("\n", System.lineSeparator()), registroPedidos.data());
        assertTrue(registroPedidos.startWith("27/03/2027"));
    }

    @Test
    public void Test04() {  //VIEDMA
        //setup
        var dispositivo = new Dispositivo();
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(5.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(10.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1, new ProveedorDeFechasFake());
        var tarjeta = new TarjetaSinDescuento();
        Propina propina = Propina.MEDIO;
//        RegistroPedidos registroPedidos = new ArchivoDePedidos("F:\\proyectos\\sistemas\\materias2025\\primer cuatrimestre\\orientacion a objetos II\\carpeta\\registroPedidos.txt");
        String pathFake = "";
        var registroPedidos = new RegistroPedidosFake(pathFake);
        String esperado = "27/03/2027 || 15.45\n";
        //excersice
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina, registroPedidos);
        //verify
        assertEquals(15.45, costoTotal, 0.1);
        assertEquals(esperado.replace("\n", System.lineSeparator()), registroPedidos.data());
        assertTrue(registroPedidos.startWith("27/03/2027"));
    }

}
