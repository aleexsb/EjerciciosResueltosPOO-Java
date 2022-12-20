package com.objetos.aIntroduccion;

class demoLibro{
    public static void main( String[] args ){
        Libro a = new Libro();
        System.out.println(a.toString());
        System.out.println(a.prestamo());
        Libro b = new Libro("Harry el pobre", "J.K RoquerFort", 10, 4);
        System.out.println(b.toString());
    }
}