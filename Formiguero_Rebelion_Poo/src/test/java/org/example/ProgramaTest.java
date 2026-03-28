package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramaTest {

    @Test
    void insertarEmpleadoTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        programa.insertarEmpleado("Pablo", "presentador");

        assertEquals(2, programa.getEmpleados().size());
    }

    @Test
    void insertarInvitadoTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        programa.insertarInvitado("Aitana", "cantante", 1, LocalDate.now());

        assertEquals(1, programa.getInvitados().size());
    }

    @Test
    void vecesInvitadoTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        programa.insertarInvitado("Aitana", "cantante", 1, LocalDate.now());
        programa.insertarInvitado("Aitana", "cantante", 2, LocalDate.now());

        assertEquals(2, programa.vecesinvitados("Aitana"));
    }

    @Test
    void buscarInvitadoTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        programa.insertarInvitado("Ibai", "streamer", 1, LocalDate.now());

        assertTrue(programa.buscarinivitado("Ibai"));
        assertFalse(programa.buscarinivitado("Aitana"));
    }
}