package org.example;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class equipo {
    private String nombre;
    private String ciudad;
    private ArrayList<jugador> jugadores;

    public equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
    }

    public void añadirjugador (jugador uno){
        jugadores.add(uno);
        uno.setEquipo(this);
        // lo añado a mi lista y le digo al jugador que ahora pertenece a este equipo
        // this = el equipo actual.
    }

    public void eliminarjugador (jugador uno){
        jugadores.remove(uno);
        uno.setEquipo(this);

        // le quito de mi lista y le borro el equipo
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void mostrarjugadores () {
        System.out.println("jugadores del equipo : "+nombre);
        for (jugador uno : jugadores ) {
            System.out.println(" - " + uno );
        }
    }
}
