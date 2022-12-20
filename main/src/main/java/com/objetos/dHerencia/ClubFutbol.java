package com.objetos.dHerencia;

/*Crear una clase ClubFutbol que tenga los atributos ubicacion, nombre del club, nombre del estadio, fecha de fundacion y colores.
con un metodo camisetaAlternativa que reciba por parametro corolesAlternativos y cambie el estado de colores por los colores alternativos. 
Y un metodo capacidadEstadio que reciba un parametro de capacidad y devuelva la capacidad mas el nombre del estadio.

Crear una clase PuntosClub hija de ClubFutbol que tenga los atributos partidos ganados, partidos perdidos y partidos empatados.
Con un metodo Puntos que calcule los puntos en base a los partidos ganados = 3puntos, partidos perdidos = 0 puntos, partidos empatados = 1 punto.
Un metodo que sea campeonn que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: campeon cuando puntos sea mayor a 40.
Y un metodo que sea descenso que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: descenso cuando puntos sea menores a 20. */

public class ClubFutbol {
    protected String ubicacion;
    protected String nombreClub;
    protected String nombreEstadio;
    protected String fechaFundacion;
    protected String colores;

    public ClubFutbol(){
        this.ubicacion = "Ezeiza";
        this.nombreClub = "Ashtarak Fc";
        this.nombreEstadio = "El templo";
        this.fechaFundacion = "01/01/2018";
        this.colores = "Azul y Blanco";
    }

    public ClubFutbol(String newUbicacion, String newNombreClub, String newNombreEstadio, String newFechaFundacion, String newColores){
        this.ubicacion = newUbicacion;
        this.nombreClub = newNombreClub;
        this.nombreEstadio = newNombreEstadio;
        this.fechaFundacion = newFechaFundacion;
        this.colores = newColores;
    }

    public String camisetaAlternativa(String coloresAlternativos){
        return this.colores = coloresAlternativos;
    }

    public void capacidadEstadio(int capacidad){
        System.out.println(this.nombreEstadio + " "+ capacidad);
    }

    public String getColores(){
        return this.colores;
    }

    public String toString(){
        return this.ubicacion + " " + this.nombreClub + " " + this.nombreEstadio + " " + this.fechaFundacion + " " + this.colores;
    }

    public String getNombreClub(){
        return this.nombreClub;
    }

}

