package org.example;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase principal de la aplicación.
 * Permite probar el funcionamiento de las clases del sistema.
 */
public class formigueroApp {

    /**
     * Método principal donde se ejecuta el programa.
     * Se crean cadenas, programas, empleados e invitados para probar el sistema.
     * @param args argumentos de entrada
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cadena
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        // Crear programa
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);

        // Ver cadena con el programa
        System.out.println(antena3);

        // Insertar empleados
        el_hormiguero.insertarEmpleado("Pablo Motos", "presentador");
        el_hormiguero.insertarEmpleado("Tecnico1", "tecnico");
        el_hormiguero.insertarEmpleado("Colaborador1", "colaborador");

        // Mostrar programa
        System.out.println(el_hormiguero);

        // Ver empleados del programa
        System.out.println("Lista empleados:");
        System.out.println(el_hormiguero.getEmpleados());

        // Insertar invitados pidiendo fecha
        System.out.println("Introduce datos para Aitana:");
        LocalDate fecha1 = pedirFecha(sc);
        el_hormiguero.insertarInvitado("Aitana", "cantante", 1, fecha1);

        System.out.println("Introduce datos para Ibai:");
        LocalDate fecha2 = pedirFecha(sc);
        el_hormiguero.insertarInvitado("Ibai", "streamer", 1, fecha2);

        System.out.println("Introduce datos para Aitana (segunda vez):");
        LocalDate fecha3 = pedirFecha(sc);
        el_hormiguero.insertarInvitado("Aitana", "cantante", 2, fecha3);

        // Ver invitados del programa
        System.out.println("Lista invitados:");
        System.out.println(el_hormiguero.getInvitados());

        // Probar métodos extra
        System.out.println("Invitados de la temporada 1:");
        el_hormiguero.contar_invitados(1);

        System.out.println("Veces que ha ido Aitana:");
        System.out.println(el_hormiguero.vecesinvitados("Aitana"));

        System.out.println("Rastrear invitado Aitana:");
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

    /**
     * Pide una fecha al usuario por consola.
     * @param sc objeto Scanner para leer datos
     * @return fecha introducida por el usuario
     */
    public static LocalDate pedirFecha(Scanner sc) {

        System.out.println("Año:");
        int año = sc.nextInt();

        System.out.println("Mes:");
        int mes = sc.nextInt();

        System.out.println("Día:");
        int dia = sc.nextInt();

        return LocalDate.of(año, mes, dia);
    }
}