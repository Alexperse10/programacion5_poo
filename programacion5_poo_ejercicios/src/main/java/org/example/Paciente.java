package org.example;

public class Paciente {

    private static final char SEXO_POR_DEFECTO = 'X'; // esto es una constante que si no se escribe nada o se escribe algo incorrecto aparece la x
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;
    //atributos private
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // contructor por defecto, es decir que si no se pone nada sale eso
    public Paciente() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
        this.dni = generarDNI();
    }

    public Paciente(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
    }

    private String generarDNI() {
        int numero = (int) (Math.random() * 100000000);
        char[] letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        char letra = letras[numero % 23];
        return numero + " " + letra;
    }

    public char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }
        return SEXO_POR_DEFECTO;
    }

    public int CalcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (altura < 0) {
            return PESO_BAJO;
        }
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esmayoredad() {
        if (edad >= 18) {
            return true;
        }

        return false;
    }
    public String mostrarinformacionpaciente () {
        return "nombre: "+nombre +
                "edad :"+edad +
                "dni :" +dni+
                "sexo :"+sexo+
                "peso :"+peso+
                "altura :"+altura;
    }

    
}
