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
    public int calcularpuntosequipo () {
        int total =0;
        for (int i =0; i<jugadores.size(); i++){  //mira desde el primer jugador hasta el ultimo
            jugador uno = jugadores.get(i); // jugador en posicion i, lo guardas en la variable uno
            total = total+ uno.getPuntos(); // coges los puntos de ese jugador y los sumas
        }
        return total;
    }
    @Override
    public String toString () {
        return "\nnombre: "+nombre;
    }

}
