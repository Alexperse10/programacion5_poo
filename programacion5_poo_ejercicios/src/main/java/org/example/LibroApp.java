package org.example;

public class LibroApp {
    public static void main(String[] args) {

        Libro libro_nuevo = new Libro(); // objeto

        libro_nuevo.setTitulo("El Quijote");
        libro_nuevo.setAutor("Cervantes");
        libro_nuevo.setNumeropaginas(500);
        libro_nuevo.setPrestado(true);
        libro_nuevo.prestar();
        libro_nuevo.devolver();

        libro_nuevo.mostrarinfo();
    }
}
