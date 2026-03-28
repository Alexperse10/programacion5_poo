package org.example;

import java.util.ArrayList;

/**
 * Clase que representa una cadena de televisión.
 * Contiene una lista de programas.
 */
public class Cadena {
    private String nombre;
    private ArrayList<Programa> programas;

    /**
     * Constructor de la cadena.
     * @param nombre nombre de la cadena
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.programas = new ArrayList<>();
    }

    /**
     * Añade un programa a la cadena si no está ya añadido.
     * También actualiza la cadena del programa.
     * @param programa programa a añadir
     */
    public void añadirprograma(Programa programa) {
        if (!programas.contains(programa)){
            programas.add(programa);
        }
        if (programa.getCadena() != this){
            programa.setCadena(this);
        }
    }

    /**
     * Elimina un programa de la cadena.
     * @param programa programa a eliminar
     */
    public void eliminarprograma(Programa programa){
        if (programas.contains(programa)) {
            programas.remove(programa);
        }
        if (programa.getCadena() == this){
            programa.setCadena(null);
        }
    }

    /**
     * Devuelve el nombre de la cadena.
     * @return nombre de la cadena
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la cadena.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de programas.
     * @return lista de programas
     */
    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    /**
     * Establece la lista de programas.
     * @param programas lista de programas
     */
    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    /**
     * Devuelve una representación en texto de la cadena.
     * @return información de la cadena
     */
    @Override
    public String toString() {
        return "cadena: "+nombre+
                "programa: "+programas.size();
    }
}