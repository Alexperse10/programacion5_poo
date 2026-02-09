package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listamodalidades;


    public Deportista(String nombre, int dia,int mes, int año) {
        this.nombre = nombre;
        this.fecha_nacimiento = LocalDate.of(año,mes,dia) ;
        this.medallas = 0; // no debe de ir parametrizado porque el deportista se crea con cero medallas, luego cuando vaya ganando se le van sumando con un set
        this.equipo = new Equipo(); // cuando te dice un equipo vacio se refiere a equipo new equipo
        this.listamodalidades = new ArrayList<>(); // se crea una lista vacia

    }
// el get se pone casi siempre porque necesitas leer los datos desde fuera de la clase
// el set solo lo pones cuando tiene sentido que se pueda modificar desde fuera
// cuando son listas, las getter si, las setter no y añades con metodos tipo inscribirse.

    public void inscribirse(String modalidad){
        listamodalidades.add(modalidad);

    }



    public String getNombre() {
        return nombre;
    }

    public void setEquipo(Equipo equipo) { // cuando inscribes a un deportista en un equipo se actualiza
        this.equipo = equipo;
    }

    public int getMedallas() { // se utiliza para ver las medallas
        return medallas;
    }

    public void setMedallas(int medallas) { // se utiliza porque la medallas pueden cambiar
        this.medallas = medallas;
    }

    public Equipo getEquipo() { // se utiliza para ver los rquipos
        return equipo;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public ArrayList<String> getListamodalidades() {
        return listamodalidades;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo.getPais() +
                ", listamodalidades=" + listamodalidades +
                '}';
    }
}


