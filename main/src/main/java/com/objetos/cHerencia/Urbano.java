package com.objetos.cHerencia;

/*Crear una clase Urbano que tenga los atributos numeroLinea, distanciaRecorrido y interno.
con un metodo BoletoMax que devuelva el valor maximo del boleto.
si la distancia del recorrido es mayor a 60 entonces el valor es 120.
si la distancia del recorrido es mayor a 30 y menor a 60, el valor es 70.
si la distancia del recorrido es mayor a 15 y menor a 30, el valor es 28.
si la distancia del recorrido es menor a 15, el valor es 25. */

public class Urbano extends Colectivo {
    private int numeroLinea;
    private int distanciaRecorrido;
    private int interno;

    public Urbano(){
        super();
        this.numeroLinea = 106;
        this.distanciaRecorrido = 16;
        this.interno = 8;
    }

    public Urbano(int newPasajeros, int newMaxPasajeros, int newAntiguedad,int newNumeroLinea, int newDistanciaRecorrido, int newInterno){
        super(newPasajeros, newMaxPasajeros, newAntiguedad);
        this.numeroLinea = newNumeroLinea;
        this.distanciaRecorrido = newDistanciaRecorrido;
        this.interno = newInterno;
    }

    @Override
    public void CantPuertas(int Cantidad) {
        System.out.println(Cantidad);
    }
    

    public void BoletoMax(){
        if (this.distanciaRecorrido>60){
            System.out.println("$120");
        } if (this.distanciaRecorrido>30 && this.distanciaRecorrido<60){
            System.out.println("$70");
        } if (this.distanciaRecorrido>15 && this.distanciaRecorrido<30){
            System.out.println("$28");
        } if (this.distanciaRecorrido<15){
            System.out.println("$25");
        }
    }

    public String toString(){
        return this.numeroLinea + " " + this.distanciaRecorrido + " " + this.interno;
    }

}

