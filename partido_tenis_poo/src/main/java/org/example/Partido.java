package org.example;

import java.util.ArrayList;

public class Partido {
    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaset;


    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.listaset = new ArrayList<>();

        jugador1.setRival(jugador1); // el constructor recibe a los dos juegador que ya deben de existir en la aplicacion principal
        jugador2.setRival(jugador2);

        // la accion reflexiva es que se asignan los rivales en el partido
    }
    public void insetarset(int puntosj1, int puntosj2) {
        Set nuevoset = new Set(puntosj1,puntosj2);
        listaset.add(nuevoset);
    }

    public void borrarset(int puntosj1, int puntosj2){
        for (int i =0; i<listaset.size(); i++) {
            Set puntos = listaset.get(i);

            if (puntos.getPuntosj1() == puntosj1 && puntos.getPuntosj2() == puntosj2){
                listaset.remove(i); // elimina ek set que esta en la posicion i de la lista
                break;
            }
        }
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaset() {
        return listaset;
    }
}