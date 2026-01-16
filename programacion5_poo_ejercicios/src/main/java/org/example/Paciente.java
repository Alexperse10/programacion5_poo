package org.example;

import java.util.Random;

public class Paciente {

    private static final char SEXO_POR_DEFECTO = 'X';
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    private Random random = new Random();

    // Constructor por defecto
    public Paciente() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
        this.dni = generarDNI();
    }

    // Constructor con todos los datos (menos DNI)
    public Paciente(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
    }

    // Constructor con nombre, edad y sexo
    public Paciente(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.dni = generarDNI();
    }

    private String generarDNI() {
        int numero = 0;

        for (int i = 0; i < 8; i++) {
            int cifra = random.nextInt(10);
            numero = numero * 10 + cifra;
        }

        char[] letras = {
                'T','R','W','A','G','M','Y','F','P','D','X','B',
                'N','J','Z','S','Q','V','H','L','C','K','E'
        };

        char letra = letras[numero % 23];
        return numero + "" + letra;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }
        return SEXO_POR_DEFECTO;
    }

    public int calcularIMC() {
        if (altura <= 0) {
            return PESO_BAJO;
        }

        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String mostrarInformacionPaciente() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    // Setters (sin DNI)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
