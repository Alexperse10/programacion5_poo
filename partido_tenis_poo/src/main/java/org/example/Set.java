package org.example;

public class Set {
    private int puntosj1;
    private int puntosj2;

    public Set(int puntosj1, int puntosj2) {
        this.puntosj1 = puntosj1;
        this.puntosj2 = puntosj2;
    }

    public boolean validarpuntos () {
        if (puntosj1<0 || puntosj2<0) {
            return false;
        } else if (puntosj1<6 && puntosj2<6) {
            return false;

        } else if (puntosj1 == 7 && (puntosj2>6 || puntosj2 <5)) {
            return false;
        } else if (puntosj2 == 7 && (puntosj1>6 || puntosj1<5)) {
            return false;
        } else {
            return true;
    }
    }

    public int getPuntosj1() {
        return puntosj1;
    }

    public int getPuntosj2() {
        return puntosj2;
    }

    public void setPuntosj1(int puntosj1) {
        this.puntosj1 = puntosj1;
    }

    public void setPuntosj2(int puntosj2) {
        this.puntosj2 = puntosj2;
    }

}
