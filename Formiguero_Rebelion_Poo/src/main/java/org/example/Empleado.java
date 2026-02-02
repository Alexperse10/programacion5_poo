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
        this.director = director;
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
}

