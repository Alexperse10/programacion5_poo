package org.example;

public class LibroApp {
    public static void main(String[] args) {

        Libro libro = new Libro(); // objeto

        libro.setTitulo("El Quijote");
        libro.setAutor("Cervantes");
        libro.setNumeropaginas(500);
        libro.setPrestado(true);
        libro.prestar();
        libro.devolver();

        libro.mostrarinfo();
    }
}
