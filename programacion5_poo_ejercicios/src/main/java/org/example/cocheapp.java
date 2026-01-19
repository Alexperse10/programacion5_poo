package org.example;

public class cocheapp {
    public static void main(String[] args) {
        coche_poo coche_1 = new coche_poo("Toyota");
        coche_poo coche_2 = new coche_poo("bmw");

        coche_1.encender();
        coche_1.acelerar(50);
        coche_1.mostrar_estado();
        coche_1.frenar(10);
        coche_1.mostrar_estado();
        coche_1.apagar();
        coche_1.acelerar(50);
        coche_1.acelerar(90);
        coche_1.mostrar_estado();
        coche_1.encender();
        coche_1.acelerar(80);
        coche_1.mostrar_estado();
    }

}
