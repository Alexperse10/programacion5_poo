package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class reserva {
    private cliente cliente;
    private habitacion_hotel habitacion_hotel;
    private LocalDate fecha;
// cosas impartantes: (porque no hay setters)
    // porque una reserva se crea y no se cambia, tampoco hay arraylist porque la ternaria une objetos no los gestiona
    public reserva(cliente cliente, habitacion_hotel habitacion_hotel, LocalDate fecha) {
        this.cliente = cliente;
        this.habitacion_hotel = habitacion_hotel;
        this.fecha = fecha;
    }
    @Override
    public String toString () {
        return "\nreserva: "+cliente +
                "\nhabitacion: "+habitacion_hotel+
                "\nfecha: "+fecha;

    }

}
