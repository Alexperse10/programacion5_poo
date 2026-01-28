package org.example;

public class jugador {
    private String nombre;
    private String nick;
    private int puntos;

    public jugador(String nombre, String Nick, int puntos) {
        this.nombre = nombre;
        this.nick = nick;
        this.puntos = puntos;

    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNick() {
        return nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString () {
        return "nombre: "+nombre+
                "nick: "+nick +
                "puntos: "+puntos;
    }


}
