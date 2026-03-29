package org.example;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString

public class Curso {

    private String nombre;
    private int horas;

    public Curso(String nombre) {
        if (nombre == null) {
            System.out.println("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
}
