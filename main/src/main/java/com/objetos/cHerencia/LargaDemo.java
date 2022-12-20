package com.objetos.cHerencia;

class DemoLargaDistancia {
    public static void main( String[] args ){
        LargaDistancia l1 = new LargaDistancia();
        LargaDistancia l2 = new LargaDistancia(50,220,35,"Condor", false, "semi-cama", 2500,20);
        l1.controlPolicial();
        l2.controlPolicial();
        System.out.println("micro 1");
        l1.valorPasaje();
        System.out.println("micro 2");
        l2.valorPasaje();
        System.out.println(l1.toSring());
        System.out.println(l2.toSring());
        l1.cargarPasajero(8);
        l1.CantPuertas(3);
        l2.CantPuertas(2);
        l1.cargar(15);
        System.out.println("Litros cargados: "+l2.cargar(95));
        System.out.println("Litros cargados: "+l2.cargar(12));
       

    }
}