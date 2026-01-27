package org.example;

import java.time.LocalDateTime;

public class prestamo {
    private estudiante estudiante;
    private libro libro;
    private LocalDateTime fecha;

    public prestamo (estudiante estudiante, libro libro, LocalDateTime fecha){
        this.estudiante = estudiante;
        this.libro = libro;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo" +
                "estudiante "+estudiante.getNombre()+
                "libro " +libro.getTitulo() +
                "fecha "+fecha;
    }
}
