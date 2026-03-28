package org.example;

import java.time.LocalDate;

/**
 * Clase que representa un invitado de un programa.
 */
public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private static int contador_invitados = 1;

    /**
     * Constructor de invitado.
     * Asigna la fecha actual automáticamente.
     * @param nombre nombre del invitado
     * @param profesion profesión
     * @param temporada temporada en la que aparece
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        contador_invitados++;

        this.temporada = temporada;
        this.fecha_visita = LocalDate.now();
    }

    /**
     * Constructor de invitado con fecha personalizada.
     * @param nombre nombre del invitado
     * @param profesion profesión
     * @param temporada temporada
     * @param fecha_visita fecha de visita
     */
    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha_visita) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;

        if (fecha_visita == null) {
            this.fecha_visita = LocalDate.now();
        } else {
            this.fecha_visita = fecha_visita;
        }
    }

    /**
     * Devuelve el nombre del invitado.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del invitado.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la temporada.
     * @return temporada
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Devuelve la fecha de visita.
     * @return fecha
     */
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    /**
     * Cambia la profesión del invitado.
     * @param profesion nueva profesión
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Devuelve la profesión.
     * @return profesión
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Establece la temporada.
     * Si no es válida se pone a 1.
     * @param temporada temporada
     */
    public void setTemporada(int temporada) {
        if (temporada > 0) {
            this.temporada = temporada;
        } else {
            this.temporada = 1;
        }
    }

    /**
     * Establece la fecha de visita.
     * Si es null se asigna la fecha actual.
     * @param fecha_visita fecha
     */
    public void setFecha_visita(LocalDate fecha_visita) {
        if (fecha_visita != null) {
            this.fecha_visita = fecha_visita;
        } else {
            this.fecha_visita = LocalDate.now();
        }
    }

    /**
     * Representación en texto del invitado.
     * @return información del invitado
     */
    @Override
    public String toString() {
        return "nombre " +nombre+
                "temporada "+temporada+
                "fecha_visita "+fecha_visita+
                "profesion "+profesion;
    }
}