package com.objetos.bHerencia;

public class Vaca extends Animal {
    protected String raza;
    protected boolean lechera;
    protected boolean ganado;

    public Vaca() {
        super();
        this.raza = "Hereford";
        this.lechera = true;
        this.ganado = true;
    }

    public Vaca(String newAltura, int newPeso, int newAños, boolean newVivo,String newRaza, boolean newLechera, boolean newGanado){
        super(newAltura, newPeso, newAños, newVivo);
        this.raza = newRaza;
        this.lechera = newLechera;
        this.ganado = newGanado;
    }

    //con un metodo ordeñar que devuelva los litros de leche que da una vaca, tiene que se lechera, parte de un ganado y tiene que existir un humano argentino.
    public void Ordeñar(String nacionalidad){
        if (lechera && ganado && nacionalidad=="Argentino"){
            System.out.println("5 Lts de leche");
        }
    }

}

