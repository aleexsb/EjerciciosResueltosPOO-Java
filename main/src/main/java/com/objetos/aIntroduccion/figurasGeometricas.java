package com.objetos.aIntroduccion;

/*3) Crear una clase figurasGeometricas con sus atributos lados.
tendra un metodo:
IdentificarFigura: a partir de los lados, identificara que figura bidimensional es( 1= circulo, 3 = triangulo, 4 rectangulo y poligonos hasta 12 lados) */

public class figurasGeometricas {
    private String circulo;
    private String triangulo;
    private String rectangulo;
    private String poligono;
    
    public figurasGeometricas() {
        this.circulo = "Circulo";
        this.triangulo = "Triangulo";
        this.rectangulo = "Rectangulo";
        this.poligono = "Poligono";
    }

    public void IdentificarFigura(int num) {
        if (num==1){
            System.out.println(circulo);
        } else if (num==3){
            System.out.println(triangulo);
        } else if (num==4){
            System.out.println(rectangulo);
        } else if (num>4 & num<=12){
            System.out.println(poligono);
        } else {
            System.out.println("No existe");
        }
    }
}

