package com.objetos.eIntegradora;

public class Diputado extends Legislador implements Votacion  {
    private String partidoPolitico;
    private String voto;


    public Diputado(String newNombre, String newApellido, int newEdad, String newProvincia, String newPartidoPolitico, String newVoto){
        super(newNombre, newApellido, newEdad, newProvincia);
        this.partidoPolitico = newPartidoPolitico;
        this.voto = newVoto;

    }

    @Override
    public void asistencias(int cantidad) {
        System.out.println(cantidad);

    }

    @Override
    public void asistenciaPorPartido(int cantidad) {
        System.out.println(cantidad+1 + this.partidoPolitico);
        
    }

    @Override
    public void elegir(int numero) {
        if (numero == 1){
            System.out.println("Voto = Positivo");
        } else if (numero == 2){
            System.out.println("Voto = Negativo");
        } else if (numero == 3){
            System.out.println("Voto = Abstiene");
        }
    }

    public void votar(){
        System.out.println(this.voto + " "+ this.nombre + " " + this.apellido + " " + this.partidoPolitico);
    }

    public String getVoto() {
        return this.voto;
    }

    
}

