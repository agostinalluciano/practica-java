package clase4.uno;

import java.util.HashMap;
import java.util.List;

public class Guardarropa {

    private final HashMap<Integer, List<Prenda>> diccionario;
    private int cont;

    public Guardarropa() {
        this.diccionario= new HashMap<>();
        this.cont=1;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        diccionario.put(cont, listaDePrenda);
        cont++;
        return cont-1;
    }

    public void mostrarPrendas(){
        diccionario.entrySet()
                .stream()
                .map(entry -> new String (entry.getKey().toString()+ entry.getValue().toString()))
                .forEach(System.out::println);
    }

    public List<Prenda> devolverPrendas(Integer numero){

        return diccionario.remove(numero);
    }
}
