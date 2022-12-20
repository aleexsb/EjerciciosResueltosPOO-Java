package com.objetos.eIntegradora;

import java.util.ArrayList;

/*
Crear una clase demoLeyes y crear 4 diputados de frente de todos, 3 de juntos por el cambio. 
Crear 3 senadores de frente de todos, 2 senadores de juntos por el cambio, 1 senador del partido obrero que estara ausente y un senador de frente de todos que sera presidente. 
Crear una variable que sea contarVotosDiputados que sume uno cuando voto = "positivo" y reste uno cuando voto = "negativo". 
Crear una variable que sea contarVotosSenadores que sume uno si contarVotosDiputados > 0 y voto = "positivo" y reste uno si contarVotosDiputados > 0 y voto = "negativo".
Si contarVotosSenadores > 0 entonces mostrar en consola "Ley aprobada" sino muestra "Ley derogada"
*/

public class DemoLeyes {

    public static void main(String[] args ) {
        int contarVotosDiputados = 0;
        int contarVotosSenadores = 0;

        ArrayList<Diputado> diputados = new ArrayList<Diputado>();

        diputados.add(new Diputado("Juan", "Perez", 47, "Mendoza", "Frente de Todos", "Positivo"));
        diputados.add(new Diputado("Franco", "Diaz", 39, "Jujuy", "Frente de Todos", "Negativo"));
        diputados.add(new Diputado("Julieta", "Martinez", 50, "Tucuman", "Frente de Todos", "Negativo"));
        diputados.add(new Diputado("Lucas", "Serrano", 54, "Buenos Aires", "Frente de Todos", "Positivo"));

        diputados.add(new Diputado("Federico", "Aguilar", 42, "Chubut", "Juntos por el Cambio", "Negativo"));
        diputados.add(new Diputado("Alan", "Sanchez", 34, "Salta", "Juntos por el Cambio", "Positivo"));
        diputados.add(new Diputado("Maria", "Soler", 29, "Corrientes", "Juntos por el Cambio", "Positivo"));
        
        for(int i = 0; i<diputados.size(); i++)
            if (diputados.get(i).getVoto() == "Positivo"){
                contarVotosDiputados +=1;
            } else{
                contarVotosDiputados -=1;
            }
        System.out.println("Votos Diputados: "+contarVotosDiputados);

        for(int i = 0; i < diputados.size(); i++)
            diputados.get(i).votar();

        ArrayList<Senador> senadores = new ArrayList<Senador>();

        senadores.add(new Senador("Axel", "Garcia", 45, "San Juan", "Frente de Todos",false, false, "Negativo"));
        senadores.add(new Senador("Fernando", "Rossi", 58, "Jujuy", "Frente de Todos",false, false, "Positivo"));
        senadores.add(new Senador("Hernan", "Colombo", 43, "Tierra del Fuego", "Frente de Todos",false, false, "Negativo"));

        senadores.add(new Senador("Sofia", "Molina", 56, "Santa cruz", "Juntos por el Cambio",false, false, "Negativo"));
        senadores.add(new Senador("Raul", "Sacheri", 33, "Neuquen", "Juntos por el Cambio",false, false, "Positivo"));

        senadores.add(new Senador("Carlos", "Morales", 63, "Santa Fe", "Partido Obrero",true, false, "Negativo"));

        senadores.add(new Senador("Gaston", "Uribe", 51, "Corrientes", "Frente de Todos",false, true, "Positivo"));

        for(int i = 0; i < senadores.size(); i++)
            if (contarVotosDiputados >0 && senadores.get(i).getVoto() == "Positivo"){
                contarVotosSenadores +=1;
            } else{
                contarVotosSenadores -= 1;
            }
        if(contarVotosSenadores>0){
            System.out.println("Ley Aprobada");
        }else{
            System.out.println("Ley Derogada");
        }
        
        for (int i = 0; i < senadores.size(); i++)
            senadores.get(i).presente();
    }
}
