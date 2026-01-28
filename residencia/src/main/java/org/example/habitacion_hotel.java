package org.example;

public class habitacion_hotel {
    private int numero;
    private String tipo;

public habitacion_hotel(int numero, String tipo) {
    this.numero = numero;
    this.tipo = tipo;


}

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nnumero "+numero +
                "\ntipo "+tipo;
    }
}

