package com.objetos.bHerencia;

/*
Crear una clase Animal que tenga los atributos Altura, peso, años,  vivo.
con un metodo Respirar que recibe como parametro un boolean y si es false, cambia el estado de vivo a false.
crear una clase humano hija de animal que tenga los atributos colorOjos, nacionalidad, mayor de edad.
Con un metodo votar que ingrese el nombre de un candidato y si es mayor de edad tiene que devolver el nombre del candidato que eligio.
Crear una clase Perro hija de animal que tenga los atributos raza, tamaño y domestico.
con un metodo Ladrar que devuelva un ladrido cuando exista un humano menor de edad y el perro no sea domestico.
Crear una clase vaca hija de animal que tenga los atributos raza, lechera, ganado.
con un metodo ordeñar que devuelva los litros de leche que da una vaca, tiene que se lechera, parte de un ganado y tiene que existir un humano argentino.
 */

public class Animal {
    protected String altura;
    protected int peso;
    protected int años;
    protected boolean vivo;

    public Animal() {
        this.altura = "1.50";
        this.peso = 40;
        this.años = 10;
        this.vivo = true;
    }

    public Animal(String newAltura, int newPeso, int newAños, boolean newVivo){
        this.altura = newAltura;
        this.peso = newPeso;
        this.años = newAños;
        this.vivo = newVivo;
    }

    public boolean Respirar(boolean respira) {
        return this.vivo = respira;
    }

    public void getVivo(){
        System.out.println(this.vivo);
    }
}

