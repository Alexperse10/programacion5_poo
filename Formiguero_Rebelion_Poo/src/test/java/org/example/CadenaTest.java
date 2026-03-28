package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadenaTest {

    @Test
    void añadirProgramaTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        cadena.añadirprograma(programa);

        assertTrue(cadena.getProgramas().contains(programa));
    }

    @Test
    void eliminarProgramaTest() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("Hormiguero", cadena, "Director");

        cadena.añadirprograma(programa);
        cadena.eliminarprograma(programa);

        assertFalse(cadena.getProgramas().contains(programa));
    }
}