package org.example;

import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombre;
    private String apellidos;

    private static  int contador_id =1;


    public Cliente(String nombre, String apellidos) {
        this.id = generarid();
        this.nombre = nombre;
        this.apellidos = apellidos;

        contador_id++;

    }

    public String generarid () {
        String num_id;
        return num_id ="ID_" +contador_id;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", contador_id=" + contador_id +
                '}';
    }
}
