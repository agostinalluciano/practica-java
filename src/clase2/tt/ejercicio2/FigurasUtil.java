package clase2.tt.ejercicio2;

import java.util.Arrays;

public class FigurasUtil {

    public static double areaPromedio(FiguraGeometrica[] arr){
        double sumT= Arrays.asList(arr).stream().map(FiguraGeometrica::area).reduce(Double::sum).orElse(0.0);
        return sumT/ arr.length;
    }
}
