package com.objetos.bHerencia;

public class Humano extends Animal {
    private String colorOjos;
    private String nacionalidad;
    private boolean mayorEdad;

    public Humano(String newColorOjos, String newNacionalidad, boolean newMayorEdad) {
        super();
        this.colorOjos = newColorOjos;
        this.nacionalidad = newNacionalidad;
        this.mayorEdad = newMayorEdad;
    }

    public Humano(String newAltura, int newPeso, int newAños,boolean newVivo,String newColorOjos, String newNacionalidad, boolean newMayorEdad) {
        super(newAltura, newPeso, newAños, newVivo);
        this.colorOjos = newColorOjos;
        this.nacionalidad = newNacionalidad;
        this.mayorEdad = newMayorEdad;
    }

    public void Votar(){
        if (mayorEdad){
            System.out.println("Julian Garcia");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public boolean getMayorEdad(){
        return this.mayorEdad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String toString() {
       return this.altura + " " + this.años + " " + this.colorOjos + " " + this.mayorEdad + " " + this.nacionalidad + " " + this.peso + " " + this.vivo;
    }
}

