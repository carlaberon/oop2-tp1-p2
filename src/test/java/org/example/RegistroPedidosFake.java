package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPedidosFake implements RegistroPedidos {
    private String data;

    public RegistroPedidosFake(String data) {
        this.data = data;
    }

    @Override
    public void registrarPedido(LocalDateTime fechaPedido, float montoTotal) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatearFecha(fechaPedido)).append(" || ").append(montoTotal).append(System.lineSeparator());
        this.data += sb.toString();
    }

    private String formatearFecha(LocalDateTime fechaInscripcion) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaInscripcion.format(formatter);
        return fechaFormateada;
    }

    public boolean startWith(String start) {
        return this.data.startsWith(start);
    }

    public String data() {
        return this.data;
    }
}