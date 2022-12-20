package com.objetos.aIntroduccion;

/*
Crear una clase PedirPrestamo con sus atributos numero_cuenta, titular, mora, valor_prestamo y cantidad_cuotas.
Tendra 3 metodos:
Deudor: Si la cuenta tiene mora, la consola debe devolver un mensaje que diga "PRESTAMO RECHAZADO" + numero_cuenta + titular.
Calcular: Si la cuenta no tiene mora, calcular el valor de las cuotas en base a la cantidad_cuotas y valor_prestamo*1.50 (se debera devolver el 50% mas del valor original del prestamo)
Depositar: se le acredita valor_prestamo a la cuenta, mostrar el deposito impactado en la cuenta 
*/

public class pedirPrestamo {
    private int numero_cuenta;
    private String titular;
    private boolean mora;
    private int valor_prestamo;
    private int cantidad_cuotas;

    public pedirPrestamo() {
        this.numero_cuenta = 789456;
        this.titular = "Julian Perez";
        this.mora = false;
        this.valor_prestamo = 20000;
        this.cantidad_cuotas = 5;    
    }
    /*
    public void Deudor(boolean mora){
        if (mora){;
            System.out.println("Prestamo Rechazado");
        } else {
            System.out.println("Prestamo Aprobado");
        }     
    }
       DE ESTA MANERA SE PASA TRUE O FALSE EN LOS PARAMETROS ABAJO EJ: P1.DEUDOR(TRUE)
    */ 

    public void InfoMora(){
        if (mora){
            System.out.println("Prestamo Rechazado" + " Cuenta: " +this.numero_cuenta + " Titular: " + this.titular);
        } else{
            System.out.println("Prestamo aprobado");
        }
    } /*ACA SE ESTAN USANDO LOS ESTADOS Y ATRIBUTOS DE MORA ARRIBA */
    
    public void Calcular() {
        if (mora==false){
            System.out.println("Valor por cuotas: " +(valor_prestamo*1.5) / cantidad_cuotas);
        } else{
            System.out.println("Prestamo Rechazado!");
        } 
    }

    public String Depositar() {
        if (mora == false){
            return "Se ha depositado en su cuenta: " + valor_prestamo;
        } else {
            return null;
        }
    }
}

