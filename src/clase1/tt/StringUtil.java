package clase1.tt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringUtil {

    public static int obtainDigit(int pos, String s) {
        return (int) s.charAt(pos);
    }

    public static String replicate(char c, int n) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = c;
        }

        return Arrays.toString(arr);
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    public static String lpad(String s, int n, char c) {

        long cantChar = s.chars().count();

        List<Character> lisc;
        lisc = s.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.toList());

        while (cantChar < n) {

            lisc.add(0, c);
            cantChar = lisc.size();
        }

        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : lisc) {
            sb.append(ch);
        }

        // convert in string
        String string = sb.toString();

        return string;

    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {

        String[] sArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
        }
        return sArr;
    }

    public static int[] toIntArray(String arr[]) {
        return Stream.of(arr).mapToInt(Integer::parseInt).toArray();
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        List<String> strings = Arrays.asList(arr);
        String longest = strings.stream().
                max(Comparator.comparingInt(String::length)).get();
        int max = longest.length();
        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {

        String[] sArr = new String[arr.length];
        int n = maxLength(arr);

        for (int i = 0; i < arr.length; i++) {

            sArr[i] = lpad(arr[i], n, c);
            arr[i] = sArr[i];
        }
    }

    public static String ltrim(String s) {

        String regex = "^\\s+";
        return s.replaceFirst(regex, "");

    }

    public static String rtrim(String s) {

        String regex = "\\s++$";
        return s.replaceFirst(regex, "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    /*Retorna la posición de la n-ésima ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
    segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
    palabra, a, 3 =7
    */
    public static int indexOfN(String s, char c, int n) {
        int i =0;
        int cont=0;
        int pos=-1;

        while (i<s.length() && cont <n) {
            if(String.valueOf(s.charAt(i)).equals(String.valueOf(c))){
                cont++;
                pos=i;
            }
            i++;
        }
        return pos;
    }


}

