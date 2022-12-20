package com.objetos.aIntroduccion;

class DemoPrestamo {
    public static void main( String[] args ){
        pedirPrestamo p1 = new pedirPrestamo();
        p1.InfoMora();
        p1.Calcular(); // SI ES VOID YA TIENE EL System.Out 
        System.out.println(p1.Depositar()); // SI TIENE STRING/INT ETC ES NECESARIO EL SYSTEM.OUT
    }
}