package clase4.uno;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        Prenda p = new Prenda("a", "b");
        ArrayList<Prenda> list=new ArrayList<Prenda>();

        Prenda q = new Prenda("c", "d");

        Guardarropa guardarropa = new Guardarropa();

        Collections.addAll(list, q, p);

        guardarropa.guardarPrendas(list);

        guardarropa.mostrarPrendas();
    }
}
