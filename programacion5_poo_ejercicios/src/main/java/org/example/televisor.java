package org.example;

public class televisor {
    // clase televisor es la caja como asi decirlo, ahora tengo que guardas los atributos, los datos
    // los datos internos son privados y necesita guardar su estado

    private int canal;
    private int volumen;
    private boolean encendido;
    // encendido es si o no por lo tanto boolean.

    // canal, volumen y encendido guardan el estado actual
    // el estado actual es decir por defecto se coloca en el constructor
    public televisor() {
        canal=1;
        volumen=200;
        encendido= false;
    }

    public void encender() { // esto son los metodos, es decir las acciones que puede realizar el televisor
        encendido = true;
        System.out.println("televisor encendido");
    }
    public void apagar() {
        encendido = false;
        System.out.println("el televisor esta apagado");
    }

    public void subircanal() {
        if (encendido && canal<99){
            canal++;
            System.out.println("canal" +canal);
        }

    }
    public void bajarcanal() {
        if (encendido && canal>1){
            canal--;
            System.out.println("el canal es: "+canal);
        }
    }
    public void subirvolumen() {
        if (encendido && volumen<99){
            volumen++;
            System.out.println("volumen es: "+volumen);
        }
    }
    public void bajarvolumen() {
        if (encendido && volumen>1){
            volumen--;
            System.out.println("volumne es: "+volumen);
        }
    }

    public int getCanal() {
        return canal;
    }
    public int getVolumen() {
        return volumen;
    }
    public boolean isEncendido() {
        return encendido;
    }

}
