package com.objetos.aIntroduccion;

//3) Crear una clase libro que tenga título, autor, nro de ejemplares, y nro de ejemplares prestados con un Método prestamo, 
//modifica los atributos correspondientes devuelve TRUE si se pudo hacer la operación y sino FALSE. 

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
        this.titulo = "Harry Potter";
        this.autor = "J.K Rowling";
        this.ejemplares = 5;
        this.ejemplaresPrestados = 3;
    }

    public Libro(String newTitulo, String newAutor, int newEjemplares, int newEjemplaresPrestados){
        this.titulo = newTitulo;
        this.autor = newAutor;
        this.ejemplares = newEjemplares;
        this.ejemplaresPrestados = newEjemplaresPrestados;
    }

    boolean prestamo(){
        return ejemplares-ejemplaresPrestados>=1;
    }

    /*
    public boolean prestamo () {
        if(ejemplares-prestamo>0) {
            return true;
        } else {
            return false;
        }
    */

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }

    public void setAutor(String newAutor){
        this.autor = newAutor;
    }

    public String toString(){
        return this.titulo + " " + this.autor + " " + this.ejemplares + " " + this.ejemplaresPrestados;
    }

}

