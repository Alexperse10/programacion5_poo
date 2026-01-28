package org.example;

public class cliente {
    private String nombre;
    private String dni;

    public cliente(String nombre,String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String toString () {
        return "\nnombre " +nombre +
                "\ndni " +dni;
    }
}
