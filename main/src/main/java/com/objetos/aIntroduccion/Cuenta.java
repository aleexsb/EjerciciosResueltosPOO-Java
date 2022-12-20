package com.objetos.aIntroduccion;

// Seleccionar texto Ctrl + K + C 
// Crear una clase Cuenta, sus atributos van a ser titular, CBU , saldo.
// Tendrá 2 métodos:
// depositar: agrega un valor al saldo (si es una cantidad negativa no hace nada).
// retirar: se resta un valor al saldo, (se comprueba que la cantidad a retirar no sea mayor a la disponible).

public class Cuenta {
    private String titular;
    private Long CBU;
    private int saldo;
    public int deposito;
    private int retiro;

    public Cuenta() {
        this.titular = "Jorge Perez";
        this.CBU = 123456789422442323L;
        this.saldo = 3000;
        this.deposito = 300;
        this.retiro = 4000;
    }

    public int depositar() {
        if (deposito > 0 ) {
            return saldo + deposito;
        } else {
            return saldo;
        }
    }

    public int retirar() {
        if (retiro<saldo) {
            return saldo - retiro;
        } else {
            return saldo;
        }
    }

    public int getRetiro() {
        return retiro;
    }

    public long getCbu() {
        return CBU;
    }

    public String getTitular(){
        return titular;
    }

}

