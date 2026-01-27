package org.example;

import java.util.ArrayList;

public class estudiante {
    private String nombre;
    private String nia;
    private String curso;
    private ArrayList<libro> libroprestado;


    public estudiante(String nombre, String nia, String curso){
        this.nombre = nombre;
        this.nia = nia;
        this.curso = curso;
        this.libroprestado =new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public String getNia() {
        return nia;
    }
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void anyadirlibro (libro l){
        libroprestado.add(l);
    }
    public void borrarlibro(libro l){
        libroprestado.remove(l);
    }

    @Override
    public String toString (){
        return "nombre "+nombre+
                "nia "+nia+
                "curso "+curso;
    }
}

