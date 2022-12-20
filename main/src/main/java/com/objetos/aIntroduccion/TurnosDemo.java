package com.objetos.aIntroduccion;

class DemoMedicos {
    public static void main( String[] args ){
        TurnosMedicos t1 = new TurnosMedicos();
        System.out.println(t1.Cancelar());
        t1.setCambiar("23/05/2020", "12:00");
        System.out.println(t1.toString());
        System.out.println(t1.Confirmar());
    }
}