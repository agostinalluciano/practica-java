package clase3.tm;

public class SortUtil {

    public static <T> void ordenar(IPrecedable<T>[] arr) {

        int n = arr.length;
        IPrecedable temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].precedeA((T) arr[j]) > 0 ) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
