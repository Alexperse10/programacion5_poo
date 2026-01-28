package org.example;

public class jugador {
    private String nombre;
    private int dorsal;
    private equipo equipo;

    //cuando creas al jugador no pertene aun a ningun equipo por eso el equipo es null.
    public jugador (String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String toString () {
        return "nombre "+nombre +
                "Dorsal "+dorsal ;

    }

}
