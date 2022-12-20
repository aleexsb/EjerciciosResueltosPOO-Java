package com.objetos.aIntroduccion;

//Crear una clase triángulo que tenga 3 lados y un metoo que saque el perimetro

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(){
        this.lado1 = 5;
        this.lado2 = 5;
        this.lado3 = 5;
    }

    public Triangulo(int newLado1, int newLado2, int newLado3) {
        this.lado1 = newLado1;
        this.lado2 = newLado2;
        this.lado3 = newLado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int newLado1) {
        this.lado1 = newLado1;
    }

    public String toString() {
        return this.lado1 + " " + this.lado2 + " " + this.lado3;
    }

    public String prueba(int num){
        if (num ==1){
            return "resultado";  /////////////////////////////////////
        } 
        return "dsadas";
        
    }

    public int sumar() {
        return lado1 + lado2 + lado3;
    }

    public void perimetro() {
        System.out.println("El perimetro total es: "+ sumar());
    }
}

