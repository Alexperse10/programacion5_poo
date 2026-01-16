package org.example;

public class Libro {
    // atributos se forman con private + tipo de variable + nombre
    private String titulo;
    private String Autor;
    private int numeropaginas;
    private boolean prestado;

    public Libro () {
        this.titulo = " ";
        this.Autor = " ";
        this.numeropaginas = 0;
        this.prestado = false;

    }

    public Libro(String titulo, String autor, int numeropaginas){
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeropaginas = numeropaginas;
    }

    public void prestar(){
        if (!prestado) {
            prestado = true;
            System.out.println("el libro ha sido prestado");
        }else {
            System.out.println("el libro ya esta prestado");
        }
    }
    public void devolver() {
        if (prestado){
            System.out.println("puedes devoolver el libro");
        }else {
            System.out.println("no puedes devolver el libro");
        }
    }

    public void mostrarinfo() {
        System.out.println("titulo: " +titulo);
        System.out.println("autor: "+Autor );
        System.out.println("numeropaginas: "+numeropaginas);
        System.out.println("prestamo: "+prestado);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getNumeropaginas() {
        return numeropaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.Autor = autor;
    }
    public void setNumeropaginas (int numeropaginas){
        this.numeropaginas = numeropaginas;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
