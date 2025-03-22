package org.example;

import java.time.LocalDateTime;

public interface RegistroPedidos {

    void registrarPedido(LocalDateTime fechaPedido, float montoTotal);

}
