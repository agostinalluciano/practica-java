package clase2.tt.ejercicio2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figus = new ArrayList<>();
        figus.add(new Circulo(2));
        figus.add(new Triangulo(3, 4));
        figus.add(new Rectangulo(3,7));


        double rdo= FigurasUtil.areaPromedio( figus.toArray(FiguraGeometrica[]::new));

        System.out.println(rdo);
    }
}
