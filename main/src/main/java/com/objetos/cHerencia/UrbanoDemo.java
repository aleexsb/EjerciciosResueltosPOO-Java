package com.objetos.cHerencia;

class DemoUrbano{
    public static void main(String[] args) {
        Urbano u1 = new Urbano();
        Urbano u2 = new Urbano(3,8,10,85, 80, 2);
        System.out.println("Colectivo 1: ");
        u1.BoletoMax();
        System.out.println("Colectivo 2: ");
        u2.BoletoMax();
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        u1.CantPuertas(2);
        u2.CantPuertas(1);
    }
}
