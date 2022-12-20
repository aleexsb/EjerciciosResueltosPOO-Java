package com.objetos.aIntroduccion;

class DemoMensaje {
    public static void main( String[] args ){
        Mensaje m1 = new Mensaje("Hola!! como estas?", "05/10/2020", "Mecanico", "Pepe");
        m1.setEditar("Hola, que tal?");
        System.out.println(m1.enviar());
    }       
}