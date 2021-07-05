package clase1.tm.practica;

public class Ejercicio5 {

    public static void main(String[] args) {

        int n, cantDigitos, d;

        n = 5;
        cantDigitos = 2;
        d = 3;


        int cont = 0;
        for (int i = 0; cont < n; i++) {


            char[] arrc = Integer.toString(i).toCharArray();

            int otroCont = 0;
            for (char c :
                    arrc) {
                if (Integer.valueOf(Character.toString(c)) == d) {
                    otroCont++;
                }
            }
            if (otroCont >= cantDigitos) {

                System.out.println(i);
                cont++;
            }
        }
    }
}
