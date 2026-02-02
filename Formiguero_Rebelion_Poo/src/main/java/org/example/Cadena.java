package org.example;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> Programas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.Programas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getProgramas() {
        return Programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        Programas = programas;
    }

    @Override
    public String toString() {
        return "nombre" +nombre;
    }
}
