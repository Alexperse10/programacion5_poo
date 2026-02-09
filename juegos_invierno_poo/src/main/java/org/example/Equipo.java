package org.example;

import java.util.ArrayList;

public class Equipo {
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

    public void setPais(String pais) {
        this.pais = pais;
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