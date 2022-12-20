package com.objetos.aIntroduccion;

// Crear una clase Mensaje con sus atributos contenidoMensaje, fecha, Receptor, emisor.
// Trendra 2 metodos:
// Editar: se podra editar el contenido del mensaje (solo acepta string).
// enviar: devuelve por consola el mensaje con fecha y emisor.

public class Mensaje {
    private String ContenidoMensaje;
    private String fecha;
    private String receptor;
    private String emisor;

    public Mensaje(String newContenidoMensaje, String newfecha, String newreceptor, String newemisor){
        this.ContenidoMensaje = newContenidoMensaje;
        this.fecha = newfecha;
        this.receptor = newreceptor;
        this.emisor = newemisor;
    }

    public void setEditar(String newcontenidoMensaje) {
        ContenidoMensaje = newcontenidoMensaje;
    }

    public String enviar() {
        return "Contenido: "+ContenidoMensaje + "\nFecha: " + fecha + "\nReceptor: "+ receptor + "\nEmisor: " +emisor;
    }

}

