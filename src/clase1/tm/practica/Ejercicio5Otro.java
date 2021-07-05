package clase1.tm.practica;

public class Ejercicio5Otro {

    public static void main(String[] args) {

        int n = 5;
        int m = 1;
        int d = 2;

        int cont = 0;

        for (int i = 0; cont < n; i++) {

            if (cumple(i, m, d)) {
                System.out.println("cumple con la condicion:" + i);
                cont++;
            }

        }

    }

    private static boolean cumple(int i, int m, int d) {

        boolean cumplio= false;

        long cantRepes = Integer.valueOf(i)
                .toString()
                .chars()
                .mapToObj(k -> (char)k)
                .filter(cChar -> cChar.toString().equals(Integer.valueOf(d).toString())) //.filter(h -> h==(char)d)????
                .count();
        if(cantRepes==m){
            cumplio=true;
        }
        return cumplio;
    }
}
