package org.example;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> empleados;
    private ArrayList<Invitado> invitados;
    private Empleado director; //decimos que director no es un string es un empleado
        // guarda un atributo del programa que guarda al empleado que dirige el programa
// cuando ponemos un objeto de la clase en este caso cadena, lo paremetrizamos sin el tipo de dato
    // programa y cadena tiene una relacion de asociacion agregacion, programa pertenece a una cadena
    // importante director es un parametro y this.director es un atributo
    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.empleados = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.director = new Empleado(director,"director", null);
        // new significa crear un objeto nuevo, aqui estoy creando un objeto nuevo
        // el primer parametro del constructor es la entrada que se le da, se le pone null en director porque el director no tiene otro director
        this.empleados.add(this.director); // añado el director a la lista de empleados

    }
}
