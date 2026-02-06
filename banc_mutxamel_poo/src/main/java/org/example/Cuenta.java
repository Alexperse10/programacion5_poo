package org.example;

import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

public class Cuenta {
private String iban;
private Cliente titular;
private double saldo;

private static int contador_iban =1;


public Cuenta() {
    this.iban = generariban();
    this.titular = null;
    this.saldo = 0;
    contador_iban++;
}


public String generariban () {
    String iban_ = "ESXX";
    return iban_ +contador_iban;
}

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +

                ", contador_iban=" + contador_iban +
                '}';
    }
}
