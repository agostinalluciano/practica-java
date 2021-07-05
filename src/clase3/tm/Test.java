package clase3.tm;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        Persona[] personas=new Persona[3];

        personas[0]=new Persona("alguien", 623);
        personas[1]=new Persona("otro", 200);
        personas[2]=new Persona("ultimo", 300);

        SortUtil.ordenar(personas);

        Arrays.stream(personas).forEach(System.out::println);


        Celular[] celulars = new Celular[3];

        celulars[0]= new Celular(1, "z");
        celulars[1]= new Celular(2, "b");
        celulars[2]= new Celular(3, "c");

        SortUtil.ordenar(celulars);

        for (Celular c:celulars
        ) {
            System.out.println(c);

        }


    }
}
