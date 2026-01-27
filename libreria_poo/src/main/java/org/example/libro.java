package org.example;

import java.time.LocalDateTime;

public class libro {
    private static int cantidad_libros = 0;
    private static int libros_disponibles = 0;
    private String titulo;
    private String Autor;
    private String libroID;
    private boolean disponible;
    private estudiante estudianteprestado; // queremos que un libro sepa a quien esta prestado
    // esto es una asociacion libro tiene un estudiante
    private editorial editorial;

    public libro(String titulo, String autor, editorial editorial) {
        this.titulo = titulo;
        this.Autor = autor;
        this.disponible = true;
        cantidad_libros++;
        this.libroID = calcularid();
        libros_disponibles++;
        this.estudianteprestado = null;// se cre un libro a null porque nadie lo tiene aun, en poo null es ausencia de objeto
        editorial.anyadirlibro(this); // relacion bidireccional


    }

    private String calcularid() {
        if (cantidad_libros < 10) {
            return "lib00" + cantidad_libros;
        } else if (cantidad_libros < 100) {
            return "lib0" + cantidad_libros;
        } else {
            return "lib" + cantidad_libros;
        }


    }

    public void prestar(estudiante e) { // el libro necesita saber a quien se presta
        // si no pasamos el estudiante, no sabriamos a quien asignarlo y no habria relacion real entre objetos
        if (disponible) {
            disponible = false;
            estudianteprestado = e;
            e.anyadirlibro(this);  // relacion biderecional
            System.out.println("El libro ha sido prestado con exito");
            libros_disponibles = libros_disponibles - 1;
            prestamo p = new prestamo(e, this, LocalDateTime.now()); // cuando pones this es el libro que se esta prestando
            // lo que hace la linea de arriba es crear un objeto prestamo que une a este libro. este estudiante y la fecha actual y guardarlo en la varuable p
            // se ha realizado un prestamo del libro actual al estudiante e en este momento.
        } else {
            System.out.println("el libro esta prestado");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            libros_disponibles = libros_disponibles + 1;
            estudianteprestado.borrarlibro(this);
            estudianteprestado = null;

            System.out.println("el libro ha sido devuelto con exito");
        } else {
            System.out.println("no estaba prestado, no se puede devolver");
        }
    }

    public boolean isDisponible (){
        return disponible;
    }

    public static int getCantidad_libros() {
        return cantidad_libros;
    }
    public static int getLibros_disponibles() {
        return libros_disponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public estudiante getEstudianteprestado(){
        return estudianteprestado;
    }

    public editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString (){
        return "titulo " +titulo +
                "Autor " +Autor+
                "disponible " +disponible+
                "cantidad de libro " +cantidad_libros+
                "libros disponibles " +libros_disponibles;
    }

}

