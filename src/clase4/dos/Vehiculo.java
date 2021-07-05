package clase4.dos;

public class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private int anguloDeGiro;
    private String patente;
    private int peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, int anguloDeGiro, String patente, int peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }
}
