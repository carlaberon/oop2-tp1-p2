package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> bebidas = new ArrayList<>();
        bebidas.add(100.0f);
        List<Float> platosPrincipales = new ArrayList<>();
        platosPrincipales.add(100.0f);
        Pedido nuevoPedido = new Pedido(platosPrincipales, bebidas, 1);
        var registro = new RegistroPedidosDAO();
//            var registro = new ArchivoDePedidos("F:\\proyectos\\sistemas\\materias2025\\primer cuatrimestre\\orientacion a objetos II\\carpeta\\registrarPedido.txt");
        var dispositivo = new Dispositivo();
        var tarjeta = new Visa();
        Propina propina = Propina.MEDIO;
        float costoTotal = dispositivo.calcularCostoTotal(nuevoPedido, tarjeta, propina, registro);
    }
}
