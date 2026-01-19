package org.example;

import java.util.Random;

public class cuenta_bancaria_poo {
    Random aleatorio = new Random();

    private String titular;
    private double saldo;
    private String numerocuenta;
    // solo la clase puede tocarlos directamente (encapsulamiento)

    public cuenta_bancaria_poo(String titular, double saldo_inicial){
        this.titular = titular;
        this.saldo = saldo_inicial;
        this.numerocuenta = generar_numero();
        // guarda el nombre en el atributo titular y guarda el saldo inicial en el atributo saldo
        // por ejemplo si yo hago new cuenta bancaria ("Alex", 1000);
        // guardaria el titular alex en titular y el saldo_inicial en saldo seria 1000
    }
    public cuenta_bancaria_poo() {
        this.titular = "";
        this.saldo = 0;

    }
    // si usaramos int se completaria con ceros delante y por eso es String aunque parezca numero
    // todo identificador se guarda como un string no como un int
    public String generar_numero (){
        String numero = "";
        for (int i =0; i<8; i++){
           numero += aleatorio.nextInt(10);
    }
        return numero;

    }
    public double ingresar_dinero (double cantidad) { // los metodos deben de modificar los atributos del objeto no las variables locales
        if (cantidad > 0) {
            saldo = cantidad + saldo;
        } else {
            System.out.println("la cantidad debe ser mayor que cero ");
        }
        return saldo;

    }
    public double retirar_dinero (double cantidad) {
        if (cantidad>0 && saldo>=cantidad){
            saldo = saldo-cantidad;
        } else {
            System.out.println("para realizar un retiro de dinero debe de ser una cantidad mayor que 0");
        }
        return saldo;
    }
    // no hay setsaldo, el saldo solo se cambia con el ingreso y el retiro de dinero
    public String getTitular () {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getnumerocuenta() {
        return numerocuenta;
    }
    public String settitular() {
        return titular;
    }
    // los setter controlan que atributos pueden modificarse desde fuera de la clase

    public void mostrarestado(){
        System.out.println("titular:"+titular);
        System.out.println("numero de cuenta" +numerocuenta);
        System.out.println("saldo" +saldo);
    }

}
