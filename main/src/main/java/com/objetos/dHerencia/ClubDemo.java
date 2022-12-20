package com.objetos.dHerencia;

import java.util.Scanner;


class DemoClub{
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        ClubFutbol c1 = new ClubFutbol();

        System.out.println("Escriba el nombre del club: ");
        String inputNombreClub = input.next();

        ClubFutbol c2 = new ClubFutbol("Temperley", inputNombreClub, "La calesita", "04/10/2021", "Verde y Negro"); // NO ME DEJA PONER NOMBRE CON ESPACIO
        c1.camisetaAlternativa("Negro y Dorado");
        System.out.println("Colores con los que jugara el equipo 1: " + c1.getColores());
        System.out.println("Colores con los que jugara el equipo 2: " + c2.getColores());
        c1.capacidadEstadio(20000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        input.close();

    }
}

