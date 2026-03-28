package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class InvitadoTest {

    @Test
    void crearInvitadoTest() {
        Invitado invi_1 = new Invitado("Aitana", "cantante", 1, LocalDate.now());

        assertEquals("Aitana", invi_1.getNombre());
        assertEquals("cantante", invi_1.getProfesion());
        assertEquals(1, invi_1.getTemporada());
    }

    @Test
    void fechaNoNullTest() {
        Invitado invi_ = new Invitado("Ibai", "streamer", 1, null);

        assertNotNull(invi_.getFecha_visita());
    }
}