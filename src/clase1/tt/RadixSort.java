package clase1.tt;

import java.util.*;
import java.util.stream.Collectors;

public class RadixSort {

    public static void radixSort(int[] arr) {

        String[] sArr = StringUtil.toStringArray(arr);

        StringUtil.lNormalize(sArr, '0');

        HashMap<Integer, ArrayList<String>> mapDeListas = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            mapDeListas.put(i, new ArrayList<String>());
        }
        int cantPos = StringUtil.maxLength(sArr);
        for (int j = cantPos - 1; j >= 0; j--) {
            asignar(sArr, j, mapDeListas);
            sArr = regenerar(mapDeListas);
            vaciarMapa(mapDeListas);
        }
        System.arraycopy(StringUtil.toIntArray(sArr), 0, arr, 0, sArr.length);
        //arr= StringUtil.toIntArray(sArr);
    }

    private static void asignar(String[] sArr, int pos, HashMap<Integer, ArrayList<String>> map) {

        for (int k = 0; k < sArr.length; k++) {
            map.get(Character.getNumericValue(sArr[k].charAt(pos))).add(sArr[k]);
        }
    }

    private static String[] regenerar(HashMap<Integer, ArrayList<String>> map) {

        List<String> listString = map.entrySet().stream()
                .filter(entry -> !entry.getValue().isEmpty())
                .map(entry -> entry.getValue())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return listString.toArray(new String[listString.size() - 1]);
    }

    private static void vaciarMapa(Map<Integer, ArrayList<String>> map) {
        map.clear();
        for (int i = 0; i < 10; i++) {
            map.put(i, new ArrayList<String>());
        }
    }


    public static void main(String[] args) {

       int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]+(i<arr.length-1?",":""));
        }

        //System.out.println(Arrays.toString(radixSort(arr)));
        int rdo= StringUtil.indexOfN("palabra", 'z', 2);

        System.out.println(rdo);
    }

}



