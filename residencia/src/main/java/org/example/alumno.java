package org.example;

public class alumno {
    private String nombre;
    private String nia;

    public alumno(String nombre, String nia) {
        this.nombre = nombre;
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNia() {
        return nia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNia (String nia) {
        this.nia = nia;
    }

    @Override
    public String toString() {
        return "\nnombre " +nombre +
                "\nnia " +nia;
    }
}
