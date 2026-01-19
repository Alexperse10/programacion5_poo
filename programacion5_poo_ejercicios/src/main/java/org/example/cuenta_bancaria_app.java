package org.example;

public class cuenta_bancaria_app {
    public static void main(String[] args) {
        cuenta_bancaria_poo cuenta_1 = new cuenta_bancaria_poo("alex", 100);
        cuenta_1.mostrarestado();
        cuenta_1.ingresar_dinero(50);
        cuenta_1.mostrarestado();
        cuenta_1.retirar_dinero(70);
        cuenta_1.mostrarestado();

    }
}
