package org.example;

public class ejercicio_libro_poo {
    private static int cantidad_libros=0;
    private static int libros_disponibles=0;
    private String titulo;
    private String autor;
    private String libro_id;
    private boolean disponible;
// atributo cantidad_ libros y libros_disponibles es static no se debe poner en el contructor no pertenece al objeto
    public ejercicio_libro_poo(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.libro_id =calcularID();
        this.disponible= true;


    }

    public String calcularID() {
        cantidad_libros++;
        libros_disponibles++;
        String numero; 
        if (cantidad_libros<10){
            numero = "00" +cantidad_libros; 
        } else if (cantidad_libros<100) {
            numero = "0" +cantidad_libros;
        }else {
            numero = String.valueOf(cantidad_libros);
        }
        return "lib" +numero;
    }
        // es void porque simplemente imprime y modifica disponible y libros_disponibles
    public void prestar () {
        if (disponible){  // si esta disponible cambiar el estado a false
            disponible = false;
           libros_disponibles= libros_disponibles-1;
            System.out.println("el libro ha sido prestado con exito");
        }else{
            System.out.println("el libro ya ha sido prestado");
        }

    }
    public void devolver () {  // es void porque imprime
        if (!disponible) {
            disponible = true;
            libros_disponibles = libros_disponibles+1;
            System.out.println("el libro ha sido devuelto con exito");
        }else{
            System.out.println("no se puede devolver porque no esta prestado");
        }
    }
    public boolean isestadiponible () {
        return disponible;
    }
    public static int getCantidad_libros() {
        return cantidad_libros;
    }
    public static int getLibros_disponibles() {
        return libros_disponibles;
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
