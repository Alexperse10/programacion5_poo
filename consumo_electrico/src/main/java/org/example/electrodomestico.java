package org.example;

public class electrodomestico {
    private String nombre;
    private int consumo;

    public electrodomestico(String nombre, int consumo) {
       this.nombre = nombre;
       this.consumo = consumo;

    }

    @Override
    public String toString() {
        return "\nnombre "+nombre +
                "\nconsumo "+consumo;
    }
}
