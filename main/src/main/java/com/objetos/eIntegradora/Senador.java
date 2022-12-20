package com.objetos.eIntegradora;

public class Senador extends Legislador implements Votacion {
    private String PartidoPolitico;
    private boolean ausente;
    private boolean presidente;
    private String voto;


    public Senador(String newNombre, String newApellido, int newEdad, String newProvincia, String newPartidoPolitico,boolean newAusente,boolean newPresidente, String newVoto ){
        super(newNombre, newApellido, newEdad, newProvincia);
        this.PartidoPolitico = newPartidoPolitico;
        this.ausente = newAusente;
        this.presidente = newPresidente;
        this.voto = newVoto;
    }

    @Override
    public void asistencias(int cantidad) {
        if (this.ausente == false){
            System.out.println(cantidad +1);
        }
    }

    @Override
    public void asistenciaPorPartido(int cantidad) {
        if (this.ausente == false){
            System.out.println(cantidad+1);
        }
    }   

    @Override
    public void elegir(int numero) {
        if(this.ausente == true && this.presidente == true){
            System.out.println("Voto = ' ' ");
        } if (this.ausente == false && this.presidente == false && numero ==1){
            System.out.println("Voto = 'Positivo' ");
        } if (numero == 2){
            System.out.println("Voto = 'Negativo' ");
        } if (numero == 3){
            System.out.println("Voto = 'Abstiene' ");
        }
    }

    public void presente(){
        if (this.ausente == false){
            System.out.println(this.nombre + " " + this.apellido + " " + this.PartidoPolitico);
        }
    }

    public String getVoto() {
        return this.voto;
    }

}


