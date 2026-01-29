package org.example;

public class liga_videojuegos_APP {
    public static void main(String[] args) {
    jugador jugador1 = new jugador("ronaldo","ronnie", 10);
    jugador jugador2 = new jugador("cocu","hielo",5);
    jugador jugador3 = new jugador("frank","kaiser",15);
    jugador jugador4 = new jugador("maradona","pelusa", 20);

    equipo equipo1 = new equipo("barcelona");
    equipo equipo2 = new equipo("madrid");
    equipo equipo3 = new equipo("atletico");
    equipo equipo4 = new equipo("valencia");

    equipo1.agregarjugador(jugador1);
    equipo1.agregarjugador(jugador2);
    equipo2.agregarjugador(jugador3);
    equipo2.agregarjugador(jugador4);

    liga liga1 = new liga("superliga");

    liga1.agregarequipo(equipo1);
    liga1.agregarequipo(equipo2);

    liga1.mostrarequipos();
    equipo1.mostrarjugadores();
    }
}
