package org.example;

import java.time.LocalDate;

public class formigueroApp {

    public static void main(String[] args) {

        // Crear cadena
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        // Crear programa
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);

        // Ver cadena con el programa
        System.out.println(antena3);

        // Insertar empleados
        el_hormiguero.insertarEmpleado("Pablo Motos", "presentador", null);
        el_hormiguero.insertarEmpleado("Tecnico1", "tecnico", el_hormiguero.getDirector());
        el_hormiguero.insertarEmpleado("Colaborador1", "colaborador", el_hormiguero.getDirector());

        // Mostrar programa
        System.out.println(el_hormiguero);

        // Ver empleados del programa
        System.out.println("Lista empleados:");
        System.out.println(el_hormiguero.getEmpleados());

        // Insertar invitados
        el_hormiguero.insertarInvitado("Aitana", "cantante", 1, LocalDate.of(2025, 3, 15));
        el_hormiguero.insertarInvitado("Ibai", "streamer", 1, LocalDate.of(2025, 4, 20));
        el_hormiguero.insertarInvitado("Aitana", "cantante", 2, LocalDate.of(2026, 2, 10));

        // Ver invitados del programa
        System.out.println("Lista invitados:");
        System.out.println(el_hormiguero.getInvitados());

        // Probar métodos extra
        System.out.println("\nInvitados de la temporada 1:");
        el_hormiguero.contar_invitados(1);

        System.out.println("\nVeces que ha ido Aitana:");
        System.out.println(el_hormiguero.vecesinvitados("Aitana"));

        System.out.println("\nRastrear invitado Aitana:");
        el_hormiguero.rastrearinvitados("Aitana");

        // Crear otra cadena y otro programa
        Cadena tve = new Cadena("TVE");
        Programa la_rebelion = new Programa("La Rebelión", tve, "Director2");

        // Insertar invitados en el otro programa
        la_rebelion.insertarInvitado("Aitana", "cantante", 1, LocalDate.of(2024, 12, 5));
        la_rebelion.insertarInvitado("Broncano", "presentador", 1, LocalDate.of(2024, 11, 20));

        // Comparar en qué programa estuvo antes
        System.out.println("\n¿En qué programa estuvo antes Aitana?");
        el_hormiguero.invitadoAntes("Aitana", la_rebelion);
    }
}
