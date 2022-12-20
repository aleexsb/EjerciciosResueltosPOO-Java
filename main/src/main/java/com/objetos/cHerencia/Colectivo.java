package com.objetos.cHerencia;

/*
Crear una clase colectivo que tenga los atributos pasajeros, maxPasajeros, antiguedad.
con un metodo cargarPasajero que recibe como parametro cantidad de pasajeros y los suma a los pasajeros sin pasarse del maximo y si la antiguedad es menor a 20 años. 
Y un metodo fueraDeServicio que devuelva la frase "FUERA DE SERVICIO" cuando la antiguedad sea mayor a 20.

crear una clase LargaDistancia hija de colactivo que tenga los atributos empresa, internacional, tipoAsientos, kilometros.
Con un metodo controlPolicial que devuelva la leyenda "Control obligatorio" para los micros que tengan destino internacional.

Y un metodo valorPasaje que devuelva 
12000 si es internacional, asientos tipo cama y mas de 1000 kilometros,
10000 si es internacional, asientos tipo semi-cama y mas de 1000 kilometros,
8000 si es internacional, asientos tipo cama y menos de 1000 kilometros,
7000 si es internacional, asientos tipo semi-cama y menos de 1000 kilometros, 
5000 si no es internacional, asiento semi-cama y mas de 800 kilometros.
4000 si no es internacional, asiento comun y mas de 800 kilometros.
3000 si no es internacional, asiento semi-cama y menos de 800 kilometros. 
3000 si no es internacional, asiento comun y menos de 800 kilometros.
 
Crear una clase Urbano que tenga los atributos numeroLinea, distanciaRecorrido y interno.
con un metodo BoletoMax que devuelva el valor maximo del boleto.
si la distancia del recorrido es mayor a 60 entonces el valor es 120.
si la distancia del recorrido es mayor a 30 y menor a 60, el valor es 70.
si la distancia del recorrido es mayor a 15 y menor a 30, el valor es 28.
si la distancia del recorrido es menor a 15, el valor es 25.
*/

public abstract class Colectivo {
    protected int pasajeros;
    protected int maxPasajeros;
    protected int antiguedad;

    public Colectivo(){
        this.pasajeros = 5;
        this.maxPasajeros = 15;
        this.antiguedad = 10;
    }

    public abstract void CantPuertas(int Cantidad);

    public Colectivo(int newPasajeros, int newMaxPasajeros, int newAntiguedad){
        this.pasajeros = newPasajeros;
        this.maxPasajeros = newMaxPasajeros;
        this.antiguedad = newAntiguedad;
    }

    public void cargarPasajero(int cantPasajero){
        if (cantPasajero+this.pasajeros < this.maxPasajeros && this.antiguedad<20){
            System.out.println(cantPasajero+pasajeros);    
        }
    }
}

