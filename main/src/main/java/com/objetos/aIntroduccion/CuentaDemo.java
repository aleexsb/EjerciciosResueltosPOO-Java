package com.objetos.aIntroduccion;

class DemoCuenta {
    public static void main( String[] args ) {
        Cuenta c1 = new Cuenta();
        System.out.println("Titular: " + c1.getTitular()+" Depositaste: " + c1.deposito + " Saldo actual: "+ c1.depositar() + " CBU: " + c1.getCbu() ); //AL SER PUBLIC DEPOSITO NO HACE FALTA GET
        System.out.println("Retiraste: " + c1.getRetiro()  + " Saldo actual: " +c1.retirar()); // AL SER RETIRO PRIVATE HACE FALTA GET
    }
}
