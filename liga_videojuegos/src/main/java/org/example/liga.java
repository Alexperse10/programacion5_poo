package org.example;

import java.util.ArrayList;

public class liga {
    private String nombre;
    private ArrayList<equipo> equipos;

    public liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public void agregarequipo (equipo uno){
        if (equipos.size()<5){
            equipos.add(uno);
            System.out.println("se ha añadido con exito");
        }else {
            System.out.println("ha excedido el numero de inscripciones");
        }

    }

    public void mostrarequipos () {
        System.out.println("--- Equipos inscritos ---");
        for (equipo uno : equipos){
            System.out.println("-" +uno);
        }
    }

    public equipo equipoganador () {
        int max =0;
        equipo ganador = null;
        for (int i =0; i<equipos.size(); i++){
            equipo uno = equipos.get(i);
            int puntos = uno.calcularpuntosequipo();

            if (puntos>max){
                max = puntos;
                ganador = uno;

            }
        }
        return ganador;
    }

    public void mostrarequipoganador () {
        System.out.println("equipo ganador: " + equipoganador().getNombre());
    }


}
