package com.objetos.dHerencia;

/*Crear una clase PuntosClub hija de ClubFutbol que tenga los atributos partidos ganados, partidos perdidos y partidos empatados.
Con un metodo Puntos que calcule los puntos en base a los partidos ganados = 3puntos, partidos perdidos = 0 puntos, partidos empatados = 1 punto.

Un metodo que sea campeonn que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: campeon cuando puntos sea mayor a 40.
Y un metodo que sea descenso que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: descenso cuando puntos sea menores a 20. */

public class PuntosClub extends ClubFutbol{
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;

    public PuntosClub(int newPartidosGanados,int newPartidosPerdidos,int newPartidosEmpatados){
        super();
        this.partidosGanados = newPartidosGanados;
        this.partidosPerdidos = newPartidosPerdidos;
        this.partidosEmpatados = newPartidosPerdidos;
    }

    public PuntosClub(String newUbicacion, String newNombreClub, String newNombreEstadio, String newFechaFundacion, String newColores,int newPartidosGanados,int newPartidosPerdidos,int newPartidosEmpatados){
        super(newUbicacion, newNombreClub, newNombreEstadio, newFechaFundacion, newColores);
        this.partidosGanados = newPartidosGanados;
        this.partidosPerdidos = newPartidosPerdidos;
        this.partidosEmpatados = newPartidosEmpatados;
    }

    public int Puntos(){
        return (this.partidosGanados*3)+(this.partidosPerdidos*0)+(this.partidosEmpatados*1);
    }

    public void Campeon(String nombreClub, int puntos){
        if (puntos>40){
            System.out.println(nombreClub+ " " +"Campeon");
        } else {
            System.out.println(nombreClub+ " " +"No salio Campeon");

        }
    }

    public void Descenso(String NombreClub, int Puntos){
        if (Puntos<20){
            System.out.println(NombreClub + " " + "Descenso");
        } else {
            System.out.println(NombreClub + " " + "NO Descendio");

        }

    }

    public String toString(){
       return this.partidosGanados + " " + this.partidosPerdidos + " " + this.partidosEmpatados;
    }

}

