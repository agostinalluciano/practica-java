package clase1.tm.practica;

import java.util.Scanner;

import static clase1.tm.practica.Ejercicio3.esPrimo;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros primos desea mostrar?");

        int n= scanner.nextInt();

        int cont=0;
        for(int i =0; cont<n; i++){
            if(esPrimo(i)){
                System.out.println(i);
                cont++;
            }
        }
    }
}
