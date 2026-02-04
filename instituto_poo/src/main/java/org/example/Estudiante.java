package org.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private Curso curso; // esto quiere decir que un estudiante tiene un curso esto es una relacion entre clases
    // se llama asociacion


    public Estudiante(String nombre,int edad, Curso curso) { // cuando creo un estudiante debe de tener un curso obligatoriamente
        this.nombre = nombre;
        this.edad = edad;
        this. curso = curso; //“Guarda dentro del estudiante la referencia al curso que me han pasado”
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso=" + curso +
                '}';
    }
}
