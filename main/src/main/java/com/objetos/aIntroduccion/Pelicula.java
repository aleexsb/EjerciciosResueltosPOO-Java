package com.objetos.aIntroduccion;

// Crear una clase pelicula que tenga titulo, directo, pais y año y un metodo que devuelva el titulo+director 

public class Pelicula {
    private String titulo;
    private String director;
    private String origen;
    private int año;

    public Pelicula() {
        this.titulo = "El coronel";
        this.director = "Steve James";
        this.origen = "Estados unidos";
        this.año = 2008;
    }

    public Pelicula (String newtitulo, String newdirector, String neworigen, int newaño) {
        this.titulo = newtitulo;
        this.director = newdirector;
        this.origen = neworigen;
        this.año = newaño;
    }

    String suma() {
        return "Titulo:" + titulo + " " + "Director: " + director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getOrigen() {
        return origen;
    }

    public int getAño() {
        return año;
    }

    public void setTitulo(String newtitulo) {
        this.titulo = newtitulo;
    }

    public void setDirector(String newdirector) {
        this.director = newdirector;
    }

    public void setOrigen(String neworigen) {
        this.origen = neworigen;
    }

    public void setAño(int newaño) {
        this.año = newaño;
    }
    
    public String toString() {
        return "Titulo: " + titulo + " Año: " + año + " Director: " + director + " Origen: " + origen;
    }

}

