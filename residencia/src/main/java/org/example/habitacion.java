package org.example;

import java.util.ArrayList;

public class habitacion {
    private String nombre;
    private double metroscuadrados;
    private ArrayList<electrodomestico> electrodomesticos;

    public habitacion(String nombre, double metroscuadrados, ArrayList<electrodomestico> electrodomesticos){
        this.nombre = nombre;
        this.metroscuadrados = metroscuadrados;
        this.electrodomesticos = electrodomesticos;
    }

    public void agregarelectrodomesticos (String nombre, Double consumo) {
        for (electrodomestico e : electrodomesticos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("ya existe un electrodomestico con ese nombre");
                return;
            }
        }
    }

}
