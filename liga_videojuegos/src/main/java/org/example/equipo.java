package org.example;

import java.util.ArrayList;

public class equipo {
    private boolean ejercicio_correcto = true;
    private String nombre;
    private ArrayList<jugador> jugadores;

    public equipo (String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void agregarjugador (jugador uno) {
        jugadores.add(uno);

    }
    public void eliminarjugador (jugador uno) {
        jugadores.remove(uno);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void mostrarjugadores () {
        System.out.println("--- lista de jugadores ----");
        for (jugador uno : jugadores){
            System.out.println("-" +uno);
        }
    }
    int contador_puntos =0;
    public int calcularpuntosequipo () {
        if (ejercicio_correcto){
            contador_puntos++;
            System.out.println("enhorabuena has consiguido un punto");
        }else {
            System.out.println("lo siento no has conseguido el punto");
        }
        return contador_puntos;
    }
    @Override
    public String toString () {
        return "\nnombre: "+nombre;
    }

}
