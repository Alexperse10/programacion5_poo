package org.example;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

public class EmpleadoTest {

    @Test
    void cargoValidoTest() {
        Empleado empleado1 = new Empleado("Juan", "tecnico", null);
        assertEquals("tecnico", empleado1.getCargo());
    }

    @Test
    void cargoInvalidoTest() {
        Empleado empleado1 = new Empleado("Juan", "cocinero", null);
        assertEquals("pte", empleado1.getCargo());
    }

    @Test
    void directorNullSiEsDirector() {
        Empleado empleado1 = new Empleado("Jefe", "director", null);
        assertNull(empleado1.getDirector());
    }
}