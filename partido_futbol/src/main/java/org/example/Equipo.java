package org.example;

public class Equipo {
    private String nombre;
    private int clasificacion;
    private Equipo rival;

    public Equipo(String nombre, int clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRival(Equipo rival) {
        this.rival = rival;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getRival() {
        return rival;
    }

    @Override
    public String toString() {
        return "nombre: "+nombre+
                "clasificacion: "+clasificacion;
    }
}
