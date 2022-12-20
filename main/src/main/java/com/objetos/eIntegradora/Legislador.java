package com.objetos.eIntegradora;

/*Crear una clase abstracta legislador que tenga los atributos nombre, apellido, edad y provincia.
con dos metodo abstracto que sea asistencias y otro que sea asistenciaPorPartido. 
Un metodo que sea asistencia por provincia que devuelva el nombre de la provincia y la cantidad de legisladores.

crear una interfaz votacion que tenga una clase abstracta elegir que reciba por parametro un numero.

Crear una clase Diputado que herede de Legislador e implemente la interfaz votacion y tenga los atributos partido politico y voto.
Con los 2 metodos abstractos de legislador, el primero de asistencia se ingrese la cantidad de diputados y devuelva que numero que le toca a este diputado. 
El segundo metodo abstracto que ingrese la cantidad de diputados de un partido politico, sume 1 y devuelva la cantidad de diputados y el nombre del partido politico. 
el metodo de la interfaz elegir que recibe 1, 2 y 3, si es 1 devuelve voto = "positivo", si es 2 devuelve voto = "negativo" y si es 3 devuelve voto = "abstiene". 
Por ultimo un metodo votar que devuelva el voto + nombre y apellido + partido politico.

Crear una clase Senador  que herede de Legislador e implemente la interfaz votacion y tenga los atributos partido politico, ausente, presidente y voto.
Con los 2 metodos abstractos de legislador, el primero de asistencia se ingrese la cantidad de senadores por parametros y devuelva la cantidad de senadores +1 si ausente = false. 
El segundo metodo abstracto que ingrese la cantidad de Senadores de un partido politico, sume 1 y devuelva el resultado si ausente = false. 
el metodo de la interfaz elegir que recibe 1, 2 y 3, si ausente = true y presidente = true entonces voto = " ",si ausente = false y presidente = false y si es 1 devuelve voto = "positivo", si es 2 devuelve voto = "negativo" y 
si es 3 devuelve voto = "abstiene". Por ultimo un metodo presente que devuelva el nombre + apellido + partido politico si ausente = false.

Crear una clase demoLeyes y crear 4 diputados de frente de todos, 3 de juntos por el cambio. 
Crear 3 senadores de frente de todos, 2 senadores de juntos por el cambio, 1 senador del partido obrero que estara ausente y un senador de frente de todos que sera presidente. 
Crear una variable que sea contarVotosDiputados que sume uno cuando voto = "positivo" y reste uno cuando voto = "negativo". 
Crear una variable que sea contarVotosSenadores que sume uno si contarVotosDiputados > 0 y voto = "positivo" y reste uno si contarVotosDiputados > 0 y voto = "negativo".
Si contarVotosSenadores > 0 entonces mostrar en consola "Ley aprobada" sino muestra "Ley derogada"
*/

public abstract class Legislador {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String provincia;

    public Legislador(String newNombre, String newApellido, int newEdad, String newProvincia){
        this.nombre = newNombre;
        this.apellido = newApellido;
        this.edad = newEdad;
        this.provincia = newProvincia;
    }

    public abstract void asistencias(int cantidad);
    
    public abstract void asistenciaPorPartido(int cantidad);

    public void asistenciaPorProvincia(int cantidad){
        System.out.println(this.provincia + cantidad);
    }

}
