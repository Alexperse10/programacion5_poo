package org.example;

import java.time.LocalDate;

public class hotelAPP {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("alex","4585424d");
        habitacion_hotel habitacion1 = new habitacion_hotel(5,"sweet");

        reserva reserva1 = new reserva(cliente1,habitacion1, LocalDate.now());

        System.out.println(reserva1);
    }
}
