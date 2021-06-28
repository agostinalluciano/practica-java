package tm.practica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int nro = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < 2 * nro; i += 2) {

            System.out.println(i);
        }
        scan.close();
    }
}
