package org.example;

import java.util.ArrayList;

public class pedido {
    private String id;
    private ArrayList<Integer> precios;

    public pedido(String id) {
        this.id = id;
        this.precios = new ArrayList<>();
    }

    public void añadirprecio (int precio_uno){
        precios.add(precio_uno);

    }
    public void eliminarprecio (int precio_uno) {
        precios.remove(precio_uno);
    }

    public int totalpedidos () {
        int total_precio =0;
        for (int i =0; i< precios.size(); i++){
            int precio_plus = precios.get(i);
            total_precio = total_precio+precio_plus;
        }
        return total_precio;
    }
    public int precio_max () {
        int precio_maxi =0;
        for (int i =0; i<precios.size(); i++){
            int precio_maxx = precios.get(i);
            if (precio_maxx>precio_maxi){
                precio_maxi = precio_maxx;
            }
        }
        return precio_maxi;
    }

    @Override
    public String toString() {
        return "id "+id +
                "precio "+precios +
                "total pedidos "+totalpedidos();

    }
}
