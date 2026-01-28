package org.example;

public class profesor_alumnoAPP {
    public static void main(String[] args) {
        profesor profesor = new profesor("federico", "matematicas");

        alumno alumno1 = new alumno("ramon", "88556652d");
        alumno alumno2 = new alumno("vanessa", "5484845d");
        alumno alumno3 = new alumno("francisco", "48587578d");

        profesor.añadiralumno(alumno1);
        profesor.añadiralumno(alumno2);
        profesor.añadiralumno(alumno3);

        System.out.println(profesor);
        System.out.println(alumno1);

        profesor.eliminaralumno(alumno3);

        profesor.mostraralumnos();

    }
}
