package org.example;

public class clase_alumno_poo {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public clase_alumno_poo(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = validar(nota1);
        this.nota2 = validar(nota2);
        this.nota3 = validar(nota3);
    }
    public clase_alumno_poo() {
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;

    }

    // metodo privado para validar nota
    private double validar (double nota) {
        if (nota>=0 && nota<=10){
            return nota;
        }
        return 0;
    }
    public double calcularmedia(){
        return (nota1 + nota2 + nota3)/3;
    }

    public boolean aprobado () {
        if (calcularmedia()>=5){
            System.out.println("enhorabuena has aprobado");
            return true;
        }else {
            System.out.println("has suspendido");
            return false;
        }

    }

    public void mostrar_info() {
        System.out.println("nombre : "+nombre);
        System.out.println("notas :"+nota1);
        System.out.println("notas :"+nota2);
        System.out.println("notas :"+nota3);
        System.out.println("media: "+calcularmedia());
        if (aprobado()){
            System.out.println("aprobado");
        }else {
            System.out.println("suspendido");
        }
        System.out.println("aprobado/suspendido :"+aprobado());
    }



    public String getNombre(){
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setnota1(double nota1) {
        this.nota1 = validar(nota1);
    }
    public void setnota2(double nota2) {
        this.nota2 = validar(nota2);
    }
    public void setnota3(double nota3) {
        this.nota3 = validar(nota3);
    }
}
