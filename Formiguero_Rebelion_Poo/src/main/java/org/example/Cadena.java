package org.example;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> programas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.programas = new ArrayList<>();
    }

    public void añadirprograma(Programa programa) {
        if (!programas.contains(programa)){
            programas.add(programa);
    }
        if (programa.getCadena() != this){
            programa.setCadena(this);
        }
}
public  void eliminarprograma(Programa programa){
        if (programas.contains(programa)) {
            programas.remove(programa);
        }
        if (programa.getCadena() == this){
            programa.setCadena(null);
        }
}
public ArrayList<Programa> getPrograma() {
        return programas;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        programas = programas;
    }

    @Override
    public String toString() {
        return "cadena: "+nombre+
                "programa: "+programas.size();
    }
}
