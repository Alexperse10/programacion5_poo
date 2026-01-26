package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hospital_poo {
    public class Paciente {

        private String Dni;
        private String nombre;
        private int edad;
        private ArrayList<cita> citas;

    }
    public class medico {
        private int numcolegiado;
        private String nombre;
        private String especialidad;

    }

    public class sala {
        private int numero;
        private int planta;

    }
    public class cita {
        private LocalDateTime fecha;
        private String paciente;
        private String medico;
        private String sala;

    }
    public class Hospital {

    }

}
}
