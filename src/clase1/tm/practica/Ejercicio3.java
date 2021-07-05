package clase1.tm.practica;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero que se desea saber si es primo");
        int i = scanner.nextInt();
        System.out.println(esPrimo(i));

    }

    public static boolean esPrimo(int n){

        boolean es=true;
        // El 0, 1 y 4 no son primos
        if (n== 0 || n == 1 || n== 4) {
            es = false;
        }
        for (int x = 2; x < n / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (n % x == 0)
                es= false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return es;
    }
}
