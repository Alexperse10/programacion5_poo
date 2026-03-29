package org.example;

/**
 * Clase que representa un empleado de un programa.
 * Puede tener distintos cargos como director, técnico, etc.
 */
public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director; // director del programa que seria otro empleado
    private static int contadorid = 1;

    /**
     * Constructor del empleado.
     * Genera automáticamente el id y valida el cargo.
     * @param nombre  del empleado
     * @param cargo  del empleado
     * @param director  del programa
     */
    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        this.id = generarid();
        contadorid++;
        this.cargo = validarCargo(cargo);

        if (this.cargo.equalsIgnoreCase("director")){
            this.director = null;
        } else {
            this.director = director;
        }
    }

    /**
     * Genera un id automático para el empleado.
     * @return id generado
     */
    private String generarid() {
        String idgenerado;
        if (contadorid < 10) {
            idgenerado = "EP00" + contadorid;
        } else if (contadorid < 100) {
            idgenerado = "EP0" + contadorid;
        } else {
            idgenerado = "EP" + contadorid;
        }
        return idgenerado;
    }

    /**
     * Valida el cargo del empleado.
     * Si no es válido devuelve "pte".
     * @param cargo a validar
     * @return cargo válido o "pte"
     */
    public String validarCargo(String cargo) {
        if (cargo.equalsIgnoreCase("director") ||
                cargo.equalsIgnoreCase("tecnico") ||
                cargo.equalsIgnoreCase("presentador") ||
                cargo.equalsIgnoreCase("colaborador")) {

            return cargo;

        } else {
            return "pte";
        }
    }

    /**
     * Cambia el nombre del empleado.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del empleado.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el cargo del empleado.
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el director del empleado.
     * @param  director
     */
    public void setDirector(Empleado director) {
        this.director = director;
    }

    /**
     * Devuelve el director del empleado.
     * @return director
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Devuelve el id del empleado.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Representación en texto del empleado.
     * @return información del empleado
     */
    @Override
    public String toString() {
        return "empleado: "+id+
                "nombre: "+nombre+
                "cargo: "+cargo;
    }
}