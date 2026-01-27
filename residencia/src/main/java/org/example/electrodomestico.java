package org.example;

public class electrodomestico {
    private String nombre;
    private double consumo;


    public electrodomestico(String nombre, double consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setConsumo(Double consumo){
        this.consumo = consumo;
    }
    @Override
    public String toString () {
        return nombre + "( " +consumo+ " kwh";
    }
}
