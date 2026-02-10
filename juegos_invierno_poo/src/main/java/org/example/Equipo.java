package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    Scanner sc = new Scanner(System.in);
    private String pais;
    private ArrayList<Deportista> listadeportista;



    public Equipo(String pais) {
        this.pais = pais;
        this.listadeportista = new ArrayList<>();
    }
    public Equipo() {  // este constructor se hace para que se pueda introducir equipos vacios, lista vacia y equipo vacio
        this.pais = "";
        this.listadeportista = new ArrayList<>();
    }

    public void inscribir_deportistas(Deportista deportista) { // añade el objeto deportista al array del equipo
        // Deportista con mayuscula es de la clase y deportista es el nombre de la variable
        listadeportista.add(deportista);
        deportista.setEquipo(this); // sirve para actualizar el equipo, this significa en el equipo actual

    }
    public void vermodalidades () {  // lo hacemos en equipo porque queremos ver las modalidades de todos los deportistas
        for (int i =0; i<listadeportista.size(); i++){
            Deportista deportista = listadeportista.get(i);
            System.out.println(deportista);
        }
    }

    public int medallastotales() {
        int contador_medallas=0;
        for (int i=0; i<listadeportista.size(); i++){
            Deportista medallas_ = listadeportista.get(i);
            contador_medallas = contador_medallas +medallas_.getMedallas();

        }
        return contador_medallas;
    }

    public void vermedallero() {

        for (int i = 0; i < listadeportista.size(); i++) {
            Deportista medallaplus = listadeportista.get(i);
            if (medallaplus.getMedallas() > 0) {
                System.out.println("deportista: "+medallaplus.getNombre()+ "numero de medallas: "+medallaplus.getMedallas());

            }
        }
    }
    public Deportista deportistaTop() {
        Deportista medallastop_ = listadeportista.get(0);  //obtiene el primer deportista de la lista (posicion 0)
        for (int i =0; i<listadeportista.size(); i++){
           Deportista Actual = listadeportista.get(i);
           if (Actual.getMedallas()>medallastop_.getMedallas()){
               medallastop_ = Actual;
           }
        }
        return medallastop_; // El tipo de retorno depende de lo que quieras devolver
        //deportista es el objeto equipo completo
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void vermedallasdeportista(Deportista deportista) {

        if (listadeportista.contains(deportista)){

                if (deportista.getMedallas() == 0){
                    System.out.println("el deportista "+deportista.getNombre()+ " no ha ganado ninguna medalla");
            }else {
                    System.out.println("el nombre es: "+deportista.getNombre()+ " el numero de medallas es: "+deportista.getMedallas());
                }

            }else {
            System.out.println("el deportista no pertenece a ninguna equipo");
        }
    }
    public Deportista deportistamasjoven () {
        Deportista deportista_menor = listadeportista.get(0);
        for (int i =0; i<listadeportista.size(); i++){
            Deportista Actual = listadeportista.get(i);
            if (Actual.getFecha_nacimiento().isAfter(deportista_menor.getFecha_nacimiento())){
                deportista_menor = Actual;
            }

        }
        return deportista_menor;
    }

    public ArrayList<Deportista> getListadeportista() {
        return listadeportista;  // pongo solo el get para asi controlar que se añadan los deportistas desde el metodo
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais ;
    }
}