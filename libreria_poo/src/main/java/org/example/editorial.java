package org.example;

import java.util.ArrayList;

public class editorial {
    private String nombre;
    private String pais;
    private ArrayList<libro> librospublicados;

    public editorial(String nombre, String pais, ArrayList<libro> librospublicados) {
        this.nombre = nombre;
        this.pais = pais;
        this.librospublicados = librospublicados;

    }

    public void anyadirlibro(libro l) {
        librospublicados.add(l);

    }
    public void borrarlibro(libro l) {
        librospublicados.remove(l);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais(String pais) {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public ArrayList<libro> getLibrospublicados() {
        return librospublicados;
    }

    @Override
    public String toString() {
        return nombre + " ( " +pais+ " )";
    }
}
