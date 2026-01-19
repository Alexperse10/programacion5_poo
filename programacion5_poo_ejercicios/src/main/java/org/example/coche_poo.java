package org.example;

public class coche_poo {
    private String marca;
    private int velocidad;
    private boolean encendido;
    // cada constructor debe dejar el objeto en un estado valido por si solo.
    public coche_poo(String marca) {
        this.marca = marca;
        this.velocidad =0;
        this.encendido = false;
    }
    // esto es lo que te sale por defecto
    public coche_poo() {
        this.marca = " ";
        this.velocidad=0;
        this.encendido = false;

    }
    public void encender() {
        if (!encendido){
            encendido = true;
            System.out.println("el coche esta encendido ");
        }else {
            System.out.println("ERROR el coche ya esta arrancado, no lo tiene que volver a encender");
        }
    }

    public void apagar() {
        if (encendido){
            encendido = false;
            velocidad = 0;
            System.out.println("el coche esta apagado");

        }

    }
    public int acelerar (int aceleracion) {
        if (!encendido){
            System.out.println("el coche esta apagado");
        }else if (aceleracion>0){
            velocidad +=aceleracion;
        }else{
            System.out.println("la aceleracions era positiva");
        }
        return velocidad;
    }

    public int frenar (int frenado) {
        if (frenado<0){
            System.out.println("el frenado debe ser positivo");

        } else if (frenado>=velocidad) {
            velocidad = 0;
        } else {
            velocidad = velocidad - frenado;
        }
        return velocidad;
    }
    public void mostrar_estado() {
        System.out.println("marca :" +marca);
        System.out.println("velocidad :"+velocidad);
        System.out.println("endido :" +encendido);
    }

    public String getMarca () {
        return marca;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public boolean isencendido() {
        return encendido;
    }

    public String setMarca() {
        return marca;
    }



}
