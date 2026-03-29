package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Estudiante {
    private String nombre;
    private int edad;
    private Curso curso;

    public Estudiante(String nombre) {
        if (nombre == null) {
            throw new NullPointerException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public Estudiante(String nombre, int edad, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
}