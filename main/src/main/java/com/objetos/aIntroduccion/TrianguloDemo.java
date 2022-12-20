package com.objetos.aIntroduccion;

class DemoTriangulo {
    public static void main( String[] args ){
        Triangulo Triangulo1 = new Triangulo();
        Triangulo Triangulo2 = new Triangulo (9, 14, 3);
        Triangulo1.perimetro();
        System.out.println(Triangulo1.toString());
        Triangulo2.perimetro();
        System.out.println(Triangulo2.getLado1());
        Triangulo2.setLado1(3); 
        Triangulo2.perimetro();
        System.out.println(Triangulo2.getLado1());
        }
    }
