package org.example;

public class clase_alumno_poo {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public clase_alumno_poo(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public clase_alumno_poo() {
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;

    }
}
