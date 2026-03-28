package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase que representa un programa de televisión.
 * Contiene empleados, invitados y un director.
 */
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> empleados;
    private ArrayList<Invitado> invitados;
    private Empleado director;

    /**
     * Constructor del programa.
     * Crea el programa y asigna un director automáticamente.
     * @param nombre nombre del programa
     * @param cadena cadena a la que pertenece
     * @param director nombre del director
     */
    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;

        this.temporadas = 0;
        this.empleados = new ArrayList<>();
        this.invitados = new ArrayList<>();

        this.director = new Empleado(director, "director", null);
        this.empleados.add(this.director);
    }

    /**
     * Inserta un empleado en el programa.
     * @param nombre nombre del empleado
     * @param cargo cargo del empleado
     */
    public void insertarEmpleado(String nombre, String cargo) {
        Empleado nuevo = new Empleado(nombre, cargo, director);

        if (!empleados.contains(nuevo)) {
            empleados.add(nuevo);
        }
    }

    /**
     * Inserta un invitado en el programa.
     * @param nombre nombre del invitado
     * @param profesion profesión
     * @param temporada temporada
     * @param fecha fecha de visita
     */
    public void insertarInvitado(String nombre, String profesion, int temporada, LocalDate fecha) {
        Invitado nuevo = new Invitado(nombre, profesion, temporada, fecha);
        invitados.add(nuevo);
    }

    /**
     * Cuenta los invitados de una temporada y los muestra por pantalla.
     * @param temporada temporada a consultar
     * @return número de invitados
     */
    public int contar_invitados(int temporada) {
        int contador = 0;
        for (int i = 0; i < invitados.size(); i++) {
            Invitado invitado = invitados.get(i);
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println(invitado.getNombre() + " - " + invitado.getProfesion());
            }
        }
        return contador;
    }

    /**
     * Devuelve cuántas veces ha ido un invitado al programa.
     * @param nombre nombre del invitado
     * @return número de veces
     */
    public int vecesinvitados(String nombre) {
        int contador_veces = 0;
        for (int i = 0; i < invitados.size(); i++) {
            Invitado invitado = invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador_veces++;
            }
        }
        return contador_veces;
    }

    /**
     * Muestra información sobre las veces que ha acudido un invitado.
     * @param nombre nombre del invitado
     */
    public void rastrearinvitados(String nombre) {
        int veces = vecesinvitados(nombre);

        if (veces == 0) {
            System.out.println(" el invitado nunca ha acudido al programa");
        } else {
            System.out.println("el invitado  " + nombre + " ha aparecido " + veces);

            for (int i = 0; i < invitados.size(); i++) {
                Invitado invitado = invitados.get(i);

                if (invitado.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("temporada "+invitado.getTemporada() +" y fecha "+invitado.getFecha_visita());
                }
            }
        }
    }

    /**
     * Busca si un invitado ha acudido al programa.
     * @param nombre nombre del invitado
     * @return true si ha acudido, false si no
     */
    public boolean buscarinivitado(String nombre) {
        for (int i =0; i<invitados.size(); i++){
            Invitado invitado = invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }

    /**
     * Compara en qué programa ha estado antes un invitado.
     * @param nombre nombre del invitado
     * @param otroprograma otro programa a comparar
     */
    public void invitadoAntes(String nombre, Programa otroprograma) {
        boolean estuvoaqui = this.buscarinivitado(nombre);
        boolean estuvoalli = otroprograma.buscarinivitado(nombre);

        if (!estuvoaqui || !estuvoalli) {
            System.out.println("el invitado debe haber acudido a ambos programas para comparar");
            return;
        }

        LocalDate fechaaqui = null;
        LocalDate fechaalli = null;

        for (int i = 0; i <this.invitados.size(); i++){
            Invitado invitado = this.invitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                fechaaqui = invitado.getFecha_visita();
                break;
            }
        }

        for (int i =0; i<otroprograma.invitados.size(); i++){
            Invitado invitado = invitados.get(i); // (tu código original)
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                fechaalli = invitado.getFecha_visita();
                break;
            }
        }

        if (fechaaqui.isBefore(fechaalli)){
            System.out.println(nombre+"estuvo antes en el programa" +getNombre());
        } else {
            System.out.println("estuvo antes en el programa "+otroprograma.getNombre());
        }
    }

    /**
     * Devuelve el director del programa.
     * @return director
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Devuelve el nombre del programa.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del programa.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cadena del programa.
     * @return cadena
     */
    public Cadena getCadena() {
        return cadena;
    }

    /**
     * Establece la cadena del programa.
     * @param cadena cadena
     */
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    /**
     * Devuelve el número de temporadas.
     * @return temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Devuelve la lista de empleados.
     * @return lista de empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Devuelve la lista de invitados.
     * @return lista de invitados
     */
    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    /**
     * Representación en texto del programa.
     * @return información del programa
     */
    @Override
    public String toString() {
        return "nombre" +nombre+
                "cadenas "+cadena+
                "temporadas "+temporadas+
                "empleados "+empleados+
                "invitados "+invitados;
    }
}