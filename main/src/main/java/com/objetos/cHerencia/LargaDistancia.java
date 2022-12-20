package com.objetos.cHerencia;

public class LargaDistancia extends Colectivo implements Nafta {
    private String empresa;
    private boolean internacional;
    private String tipoAsientos;
    private int kilometros;
    private int combustible;

    public LargaDistancia(){
        super();
        this.empresa = "Plusmar";
        this.internacional = true;
        this.tipoAsientos = "cama";
        this.kilometros = 700;
        this.combustible = 10;
    }

    public LargaDistancia(int newPasajeros, int newMaxPasajeros, int newAntiguedad,String newEmpresa, boolean newInternacional, String newTipoAsientos, int newKilometros, int newCombustible ){
        super(newPasajeros, newMaxPasajeros, newAntiguedad);
        this.empresa = newEmpresa;
        this.internacional = newInternacional;
        this.tipoAsientos = newTipoAsientos;
        this.kilometros = newKilometros;
        this.combustible = newCombustible;
    }

    @Override
    public void CantPuertas(int cantidad) {
        System.out.println(cantidad);
    }

    @Override
    public int cargar(int litros) {
        if (litros+combustible < CARGA_MAX){
            return litros+combustible;
        } else{
            return 0;
        }
    }

    public void controlPolicial(){
        if (this.internacional){
            System.out.println("Control Obligatorio!");
        } else{
            System.out.println("Siga siga !");
        }
    }

    public void valorPasaje(){
        if (internacional && this.tipoAsientos == "cama" && this.kilometros>1000){
            System.out.println("Valor $12000");
        } if (internacional && this.tipoAsientos == "semi-cama" && this.kilometros>1000){
            System.out.println("Valor $10000");
        } if (internacional && this.tipoAsientos == "cama" && this.kilometros<1000){
            System.out.println("Valor $8000");
        } if (internacional && this.tipoAsientos == "semi-cama" && this.kilometros<1000){
            System.out.println("Valor $7000");
        } if (internacional == false && this.tipoAsientos == "semi-cama" && this.kilometros>800){
            System.out.println("Valor $5000");
        } if (internacional == false && this.tipoAsientos == "comun" && this.kilometros>800){
            System.out.println("$Valor 4000");
        } if (internacional == false && this.tipoAsientos == "semi-cama" && this.kilometros<800){
            System.out.println("$Valor 3000");
        } if (internacional ==false && this.tipoAsientos == "comun" && this.kilometros<800){
            System.out.println("$Valor 3000");
        }
    }  

    public String toSring(){
        return this.pasajeros + " " + this.maxPasajeros + " " + this.antiguedad + " " + this.empresa + " " + this.internacional + " " + this.tipoAsientos + " " + this.kilometros ;
    }

}

