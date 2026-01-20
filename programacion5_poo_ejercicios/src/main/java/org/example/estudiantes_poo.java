package org.example;

public class estudiantes_poo {
    private static int contadorestudiantes =0;
    private static int siguienteNIA = 1;
    private String nombre;
    private String curso;
    private int Nia;
    private String email;

    public estudiantes_poo(String Nombre) {
        this.nombre = Nombre;
        contadorestudiantes ++;
        this.Nia = siguienteNIA;
        siguienteNIA ++;
    }

    public estudiantes_poo() {
        this.nombre = "";
        this.curso = "";
        this.email = "";
    }
}
