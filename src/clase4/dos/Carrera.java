package clase4.dos;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private double distancia;
    private float premioEnDolares;
    private String nombre;
    private int cantDeVehiculosPermitidos;
    private List<Vehiculo> vehiculos;

    public Carrera(double distancia, float premioEnDolares, String nombre, int cantDeVehiculosPermitidos ) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantDeVehiculosPermitidos = cantDeVehiculosPermitidos;
        this.vehiculos = new ArrayList<>();
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, int AnguloDeGiro, String patente){
        if(hayCupo()){}


    }

    public void darDeAltaMoto(double velocidad, double aceleracion, int AnguloDeGiro, String patente){

    }

    private boolean hayCupo(){
        return vehiculos.size()<cantDeVehiculosPermitidos;
    }




}
