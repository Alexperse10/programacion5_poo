package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
// en esta clase debe ir el metodo de contar invitados ya que es donde se encuentra la lista.
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> empleados;
    private ArrayList<Invitado> invitados; // invitados es una variable, una lista de invitados, es un contenedor guarada muchos invitados
    private Empleado director; //decimos que director no es un string es un empleado

    // guarda un atributo del programa que guarda al empleado que dirige el programa
// cuando ponemos un objeto de la clase en este caso cadena, lo paremetrizamos sin el tipo de dato
    // programa y cadena tiene una relacion de asociacion agregacion, programa pertenece a una cadena
    // importante director es un parametro y this.director es un atributo
    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.empleados = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.director = new Empleado(director, "director", null); // el director se crea en el constructor
        // new significa crear un objeto nuevo, aqui estoy creando un objeto nuevo
        // el primer parametro del constructor es la entrada que se le da, se le pone null en director porque el director no tiene otro director
        this.empleados.add(this.director); // añado el director a la lista de empleados

    }

    // hago el metodo en programa porque se encuentra la informacion que necesito como es la lista de invitados
    // se parametriza para que el metodo sepa que temporada tiene tantos invitados
    public int contar_invitados(int temporada) {
        int contador = 0;
        for (int i = 0; i < invitados.size(); i++) {
            Invitado invitado = invitados.get(i); // De la lista invitados, saca el invitado que está en la posición i y guárdalo en la variable invitado
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println(invitado.getNombre() + " - " + invitado.getProfesion());
            }

        }
        return contador;


    }

    public int vecesinvitados(String nombre) {
        int contador_veces = 0;
        for (int i = 0; i < invitados.size(); i++) { // se pone la lista porque es el numero de invitados
            Invitado invitado = invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador_veces++;
            }

        }
        return contador_veces;
    }

    public void rastrearinvitados(String nombre) {
        int veces = vecesinvitados(nombre);
        if (veces == 0) {
            System.out.println(" el invitado nunca ha acudido al programa");

        }else {
            System.out.println("el invitado  " + nombre + " ha aparecido " + veces);

            for (int i = 0; i < invitados.size(); i++) {
                Invitado invitado = invitados.get(i);

                if (invitado.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("temporada "+invitado.getTemporada() +" y fecha "+invitado.getFecha_visita());
                }
            }
        }

    }

    public boolean buscarinivitado(String nombre) {
        for (int i =0; i<invitados.size(); i++){
            Invitado invitado = invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                return true;

            }
        }
        return false;
    }

    public void invitadoAntes(String nombre, Programa otroprograma) {
        boolean estuvoaqui = this.buscarinivitado(nombre); // se utiliza this para referirse al programa actual. si el invitado a ido a este programa.
        boolean estuvoalli = otroprograma.buscarinivitado(nombre);// si ha ido al otro programa

        if (!estuvoaqui || !estuvoalli) { // no estuvo aqui y no estuvo alli
            System.out.println("el invitado debe haber acudido a ambos programas para comparar");

            return;
        }
        LocalDate fechaaqui = null; // se crean dos variables para guardar las fechas, empieza en null porque aun no sabemos las fechas
        LocalDate fechaalli = null;

        for (int i = 0; i <this.invitados.size(); i++){
            Invitado invitado = this.invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                fechaaqui = invitado.getFecha_visita();
                break;
            }
        }
        for (int i =0; i<otroprograma.invitados.size(); i++){
            Invitado invitado = invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                fechaalli = invitado.getFecha_visita();
                break;
            }
        }
        if (fechaaqui.isBefore(fechaalli)){
            System.out.println(nombre+"estuvo antes en el programa" +this.getNombre());
        }else {
            System.out.println("estuvo antes en el programa "+otroprograma.getNombre());
        }
    }
    public Empleado getDirector() {
        return director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }
    // no se ponen las temporadas en set porque se incrementan, no se introducen

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    @Override
    public String toString() {
        return "nombre" +nombre+
                "cadenas "+cadena+
                "temporadas "+temporadas;
    }
}
