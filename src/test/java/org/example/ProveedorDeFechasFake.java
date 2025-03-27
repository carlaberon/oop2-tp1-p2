package org.example;

import java.time.LocalDateTime;

public class ProveedorDeFechasFake implements ProveedorDeFechas {
    @Override
    public LocalDateTime fecha() {
        return LocalDateTime.of(2027, 03, 27, 10, 9, 8);
    }
}
