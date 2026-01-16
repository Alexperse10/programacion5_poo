package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        televisor tv1 = new televisor();
        televisor tv2 = new televisor();

        tv1.apagar();
        tv1.subircanal();
        tv1.subirvolumen();
        tv1.subirvolumen();
        tv1.subirvolumen();

        System.out.println();

        tv2.encender();
        tv2.bajarcanal();
        tv2.subircanal();
        tv2.bajarvolumen();

        int canalactual = tv1.getCanal();  // esto seria el getter
        System.out.println(canalactual);




        }
    }
