package org.example;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaprograma;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaprograma = new ArrayList<>(); // como dice que la cadena empieza sin programas no se parametriza
        // si me dijese que empiza con programas se paremetriza
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaprograma() {
        return listaprograma;
    }

    public
}
