package org.example;

import java.util.Scanner;

public class PacienteAPP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Paciente p1 = new Paciente(nombre, edad, sexo, peso, altura);
        Paciente p2 = new Paciente(nombre, edad, sexo);
        Paciente p3 = new Paciente();

        p3.setNombre("Paciente por defecto");
        p3.setEdad(30);
        p3.setSexo('h');
        p3.setPeso(80);
        p3.setAltura(1.75);

        mostrarResultadoIMC(p1);
        mostrarResultadoIMC(p2);
        mostrarResultadoIMC(p3);

        System.out.println("\n--- Información de los pacientes ---");
        System.out.println(p1.mostrarInformacionPaciente());
        System.out.println();
        System.out.println(p2.mostrarInformacionPaciente());
        System.out.println();
        System.out.println(p3.mostrarInformacionPaciente());
    }

    private static void mostrarResultadoIMC(Paciente p) {
        int resultado = p.calcularIMC();

        if (resultado == -1) {
            System.out.println("Está por debajo de su peso ideal");
        } else if (resultado == 0) {
            System.out.println("Está en su peso ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }

        System.out.println("¿Mayor de edad?: " + p.esMayorDeEdad());
        System.out.println();
    }
}
