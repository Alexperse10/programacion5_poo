package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class Instituto {

    private final String nombre;
    @Setter
    private String poblacion;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

    public Instituto(String nombre, String poblacion) {
        if (nombre == null) {
            this.nombre = "Instituto sin nombre";
        } else {
            this.nombre = nombre;
        }

        this.poblacion = poblacion;
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void insertarcurso(Curso curso) {
        if (curso == null) {
            System.out.println("el curso no puede ser null");
            return;
        }

        if (cursos.contains(curso)) {
            System.out.println("no se pueden introducir nombres duplicados");
            return;
        }

        cursos.add(curso);
    }
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("el estudiante no puede ser null");
            return;
        }

        for (Estudiante e : estudiantes) {
            if (e.getNombre().equals(estudiante.getNombre())) {
                System.out.println("El estudiante ya existe");
                return;
            }
        }

        this.estudiantes.add(estudiante);
    }

}