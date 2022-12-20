package com.objetos.bHerencia;

public class Perro extends Animal {
    protected String raza;
    protected String tamaño;
    protected boolean domestico;

    public Perro() {
        super();
        this.raza = "Labrador";
        this.tamaño = "1.20";
        this.domestico = false;
    }

    public Perro(String newAltura, int newPeso, int newAños,boolean newVivo,String newColorOjos, String newNacionalidad, boolean newMayorEdad, String newRaza,String newTamaño,boolean newDomestico) {
        super(newAltura, newPeso, newAños, newVivo);
        this.raza = newRaza;
        this.tamaño = newTamaño;
        this.domestico = newDomestico;
    }

    public void Ladrar(boolean mayorEdad) {
        if (!mayorEdad && !domestico){ // CON SIGNO DE EXCLAMACION ES LO CONTRARO/DISTINTO
            System.out.println("Ladrar");
        } else {
            System.out.println("No ladrar");
        }
    }
}

