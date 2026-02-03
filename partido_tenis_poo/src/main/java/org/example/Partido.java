package org.example;

import java.util.ArrayList;

public class Partido {
    private String jugador1;
    private String jugador2;
    private ArrayList<Partido> listaset;


    public Partido(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.listaset = new ArrayList<>();
    }


}