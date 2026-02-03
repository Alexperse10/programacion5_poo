package org.example;

public class PartidoApp {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("alex", 2);
        Jugador jugador2 = new Jugador("pedro", 5);

        Partido partido1 = new Partido(jugador1,jugador2);

        partido1.insetarset(6,4);
        partido1.insetarset(7,6);

        System.out.println("jugador 1 "+partido1.getJugador1().getNombre());
        System.out.println("jugador 2"+partido1.getJugador2().getNombre());

        System.out.println("total de sets jugados" +partido1.getListaset().size());






    }
}