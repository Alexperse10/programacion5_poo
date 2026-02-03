package org.example;

public class Resultado {
    private int goleslocales;
    private int golesvisitante;

    public Resultado(int goleslocales, int golesvisitante) {
        this.goleslocales = goleslocales;
        this.golesvisitante = golesvisitante;
    }
    public boolean validargoles(int goleslocales, int golesvisitante) {
        if (goleslocales<0 || golesvisitante<0) {
            return false;
        }else {
            return true;
        }
    }



    public int getGoleslocales() {
        return goleslocales;
    }

    public int getGolesvisitante() {
        return golesvisitante;
    }

    public void setGoleslocales(int goleslocales) {
        this.goleslocales = goleslocales;
    }

    public void setGolesvisitante(int golesvisitante) {
        this.golesvisitante = golesvisitante;
    }

    @Override
    public String toString (){
        return "goles locales: "+goleslocales+
                "goles visitantes: "+golesvisitante;
    }
}
