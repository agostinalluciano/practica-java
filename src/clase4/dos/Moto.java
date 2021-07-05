package clase4.dos;

public class Moto extends Vehiculo{

    private final static int CANT_RUEDAS=2;
    private final static int PESO=300;


    public Moto(double velocidad, double aceleracion, int anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, PESO, CANT_RUEDAS);
    }

}
