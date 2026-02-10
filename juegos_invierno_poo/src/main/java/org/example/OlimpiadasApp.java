package org.example;

import java.util.Scanner;

public class OlimpiadasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deportista deportista1 = new Deportista("alex", 17, 5, 1996);
        Deportista deportista2 = new Deportista("ronnie", 20,4,1990);
        Deportista deportista3 = new Deportista("laudrup",15,2,1975);
        Deportista deportista4 = new Deportista("cocu",20,5,1990);
        Deportista deportista5 = new Deportista("larsson",20,4,1985);
        deportista2.setMedallas(4);
        deportista1.setMedallas(7);
        deportista3.setMedallas(8);
        deportista4.setMedallas(10);
        deportista4.getMedallas();
        System.out.println(deportista4.getMedallas());
        System.out.println(deportista3.getMedallas());
        System.out.println();

        Equipo barcelona = new Equipo("España");
        barcelona.inscribir_deportistas(deportista2);
        barcelona.inscribir_deportistas(deportista1);
        Equipo mutxamel = new Equipo("España");
        mutxamel.inscribir_deportistas(deportista3);
        mutxamel.inscribir_deportistas(deportista4);
        System.out.println(deportista1);
        deportista2.inscribirse("sky");
        deportista1.inscribirse("snowboard");
        deportista3.inscribirse("bobslade");
        deportista4.inscribirse("sky fondo");

        barcelona.vermodalidades();
        mutxamel.vermodalidades();
        System.out.println("las medallas totales son : "+(mutxamel.medallastotales()+ barcelona.medallastotales()));        // deportista sabe sus modalidades, metodo para una persona
        // Equipo sabe la lista de deportistas metodo para todos.
        // poner los parentesis para sumar ya que si no los pones te concatena los numeros y no los suma

        mutxamel.vermedallero();
        barcelona.vermedallero();


        barcelona.vermedallasdeportista(deportista1);
        barcelona.vermedallasdeportista(deportista5);
        System.out.print(barcelona.deportistamasjoven().getNombre() );



    }
}
