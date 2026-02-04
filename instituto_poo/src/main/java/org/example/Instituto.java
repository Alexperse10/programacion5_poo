package org.example;

import java.util.ArrayList;

public class Instituto {
    private final String nombre; // poniendo final puedo hacer que un atributo no se pueda modificar despues de crearlo
    private String poblacion;
    private ArrayList<Estudiante> estudiante;
    private ArrayList<Curso> cursos;
// cursos guarda todos los cursos que tiene el instuto, muchos objetos curso
    // en cursos es donde se evitan duplicados, se controla el conjunto.
    public Instituto(String nombre, String poblacion ) {
        if (nombre == null) {
            this.nombre = "instituto sin nombre";
        }else {
            this.nombre = nombre;
        }
        this.poblacion = poblacion;
        this.estudiante = new ArrayList<>();
        this.cursos = new ArrayList<>();

    }

    public void insertarcurso (Curso curso){ // se hace en instituto porque es el dueño de la lista cursos, es quien gestiona las listas
        if (curso == null){
            System.out.println("el curso no puede ser null");
            return;
        } if (cursos.contains(curso)){
            System.out.println("no se pueden introducir nombres duplicados");
            return;
        // introduzco un curso que si ya esta en la lista cursos me salta un error.
        }
        cursos.add(curso);
    }



    public String getNombre() {
        return nombre;
    }



    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", estudiante=" + estudiante +
                ", cursos=" + cursos +
                '}';
    }
}
