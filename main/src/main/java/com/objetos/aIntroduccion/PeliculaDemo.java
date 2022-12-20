package com.objetos.aIntroduccion;

class DemoPeli {
    public static void main( String[] args ) {
        Pelicula a = new Pelicula();
        System.out.println(a.suma());
        Pelicula b = new Pelicula("Codeando 2.0", "Los Pibes", "Argentina", 2022);
        System.out.println(b.toString());
    }
}
