package clase1.tm.practica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer nro, cantMultiplos;

        System.out.println("Ingrese un numero para obtener multiplos");

        nro =Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese un cant multiplos");

        cantMultiplos =Integer.parseInt(scan.nextLine());

        for(int i =1; i<=cantMultiplos; i++) {
            System.out.println(i * nro);
        }


    }
}
