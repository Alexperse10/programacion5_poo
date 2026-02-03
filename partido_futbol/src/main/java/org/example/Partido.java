package org.example;

import java.util.ArrayList;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private ArrayList<Resultado> listaresultado;


    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.listaresultado = new ArrayList<>();

        equipo1.setRival(equipo2);
        equipo2.setRival(equipo1);

    }



    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public ArrayList<Resultado> getListaresultado() {
        return listaresultado;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1=" + equipo1 +
                ", equipo2=" + equipo2 +
                ", listaresultado=" + listaresultado +
                '}';
    }
}
