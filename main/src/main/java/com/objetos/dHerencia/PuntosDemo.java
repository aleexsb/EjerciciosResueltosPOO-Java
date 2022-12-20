package com.objetos.dHerencia;

import java.util.Scanner;

class DemoPuntos{
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        PuntosClub p1 = new PuntosClub(12,6,3);
        PuntosClub p2 = new PuntosClub(2,7,12);
        ClubFutbol f1 = new ClubFutbol();

        System.out.println("Escriba la Ubicacion: ");
        String inputUbicacion = input.next();

        ClubFutbol f2 = new ClubFutbol(inputUbicacion, "Borbotones", "La calesita", "04/10/2021", "Verde y Negro");
        System.out.println(f1.toString() + " Puntos = "+ p1.Puntos());
        System.out.println(f2.toString() + " Puntos = "+ p2.Puntos());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(f1.toString()); // MUESTRA EL TO STRING DE CLUBFUTBOL
        p1.Campeon(f1.getNombreClub(), p1.Puntos());
        p2.Campeon(f2.getNombreClub(), p2.Puntos());
        p1.Descenso(f1.getNombreClub(), p1.Puntos());
        p2.Descenso(f2.getNombreClub(), p2.Puntos());
        
        input.close();
    }
}