package com.objetos.bHerencia;

class DemoVaca {
    public static void main( String[] args ){
    Humano h1 = new Humano("Marron", "Argentino", true);
    Vaca v1 = new Vaca(); //  ACA SE LE COLOCA O NADA O 7 PARAMETROS
    v1.Ordeñar(h1.getNacionalidad()); // SI NO EXISTE HUMANO H1 NO VOY A PODER LLAMAR AL GET
    }

}