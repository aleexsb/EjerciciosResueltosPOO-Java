package com.objetos.bHerencia;

class DemoHumano {
    public static void main( String[] args ){
    Humano h1 = new Humano("1.80", 30, 20, true, "marron", "Holanda", false);
    Humano h2 = new Humano("verde", "brasilero", true);
    h1.Votar();
    h2.Votar();
    System.out.println(h1.toString());
    System.out.println(h2.toString());
    }
}
