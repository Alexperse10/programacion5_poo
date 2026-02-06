package org.example;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director; // director del programa que seria otro empleado
    private static int contadorid = 1;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        this.id = generarid();
        contadorid++;
        this.cargo = validarCargo(cargo);
        if (this.cargo.equalsIgnoreCase("director")){
           this.director = null;
        }else {
            this.director = director;
        }

    }


    public String generarid() {
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

    public String validarCargo(String cargo) { // hay que parametrizarlo es decir meter una variable
        // para que pueda trabajar, sino no sabe que parametro tiene que validar
        if (cargo.equalsIgnoreCase("director") ||
                cargo.equalsIgnoreCase("tecnico") ||
                cargo.equalsIgnoreCase("presentador") ||
                cargo.equalsIgnoreCase("colaborador")) {

            return cargo;

        } else {
            return "pte";
        }
    }

    // set cargo no se pone porque ya lo valiadas en el constructor entonces si pones setter en en cargo alguien podria cambiarlo

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public Empleado getDirector() {
        return director;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "empleado: "+id+
                "nombre: "+nombre+
                "cargo: "+cargo;
    }


}

