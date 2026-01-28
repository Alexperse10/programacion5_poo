package org.example;

import java.util.ArrayList;

public class profesor {
    private String Nombre;
    private String Asignatura;
    private ArrayList<alumno> alumnos;

    public profesor(String Nombre, String Asignatura) {
        this.Nombre = Nombre;
        this.Asignatura = Asignatura;
        this.alumnos = new ArrayList<>();

    }
    public void añadiralumno (alumno uno){
        alumnos.add(uno);
    }

    public void eliminaralumno (alumno uno){
        alumnos.remove(uno);
    }
    @Override
    public String toString () {
        return  "infromacion profesor" +
                "\nnombre " +Nombre +
                "\nAsignatura "+Asignatura;
    }
    // para cada alumno que hay en la lista alumnos, haz algo
    // alumnos array del profesor, cada vuelta del bucle "uno" cambia al siguienete alumno
    public void mostraralumnos () {
        System.out.println("alumnos del profesor " +Nombre+ " :");
        for (alumno uno : alumnos) {
            System.out.println("-" +uno);
        }
    }


}
