package org.example;

import java.time.LocalDate;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private static int contador_invitados = 1;

    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha_visita) {
        this.nombre = nombre;
        this.profesion = profesion;
        contador_invitados++;
        this.temporada = temporada;
        this.fecha_visita = fecha_visita;
    }


LocalDate fecha = LocalDate.of(2025,03,15);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public LocalDate getFecha_visita() {
        System.out.println("fecha de programa "+fecha);
        return fecha;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    @Override
    public String toString() {
        return "nombre " +nombre+
                "temporada "+temporada+
                "fecha_visita "+fecha_visita+
                "profesion "+profesion;
    }
}
