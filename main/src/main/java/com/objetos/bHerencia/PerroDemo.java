package com.objetos.bHerencia;

class DemoPerro{
    public static void main( String[] args ){
    Humano h1 = new Humano("Negro", "Polaco", false);
    Perro p1 = new Perro(); // PARA QUE 2 OBJETOS INTERACTUEN, TIENEN Q ESTAR DEFINIDOS
    Perro p2 = new Perro("1.5", 30, 5, true, "azul", "Español", true, "Caniche", "1.6", true);
    p1.Ladrar(h1.getMayorEdad());
    p2.Ladrar(h1.getMayorEdad()); 
    }
}