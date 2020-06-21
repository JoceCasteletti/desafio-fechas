package fechas;

import java.util.Scanner;

public class fechas {

    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        String fecha1, fecha2;

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        fecha1 = date.next();

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        fecha2 = date.next();

        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6, 9));

        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6, 9));

        if (anio1 < anio2) {
            System.out.println("Persona 1 es mayor");
        } else if (anio1 > anio2) {
            System.out.println("Persona 2 es mayor");
        } else if (anio1 == anio2) {
            if (mes1 < mes2) {
                System.out.println("Persona 1 es mayor");
            } else if (mes1 > mes2) {
                System.out.println("Persona 2 es mayor");
            } else if (mes1 == mes2) {

                if (dia1 < dia2) {
                    System.out.println("Persona 1 es mayor");
                } else if (mes1 < mes2) {
                    System.out.println("Persona 2 es mayor");
                } else if (dia1 == dia2) {
                    System.out.println("Tienen la misma edad");
                }

            }
        }

    }

}