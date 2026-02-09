package org.example;

public class OlimpiadasApp {
    public static void main(String[] args) {

        Deportista deportista1 = new Deportista("alex", 17, 5, 1996);
        Deportista deportista2 = new Deportista("ronnie", 20,4,1990);
        Deportista deportista3 = new Deportista("laudrup",15,2,1975);
        Deportista deportista4 = new Deportista("cocu",20,5,1990); 
        deportista2.setMedallas(4);
        deportista1.setMedallas(7);


        Equipo barcelona = new Equipo("España");
        barcelona.inscribir_deportistas(deportista2);
        barcelona.inscribir_deportistas(deportista1);
        System.out.println(deportista1);
        deportista2.inscribirse("sky");
        deportista1.inscribirse("snowboard");


    }
}
