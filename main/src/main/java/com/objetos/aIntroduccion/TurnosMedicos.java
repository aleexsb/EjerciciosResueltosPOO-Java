package com.objetos.aIntroduccion;

/*Crear una clase TurnosMedicos con sus atributos fecha, hora, profesional y lugar
Tendra 3 metodos:
Cancelar: muestra en consola "TURNO CANCELADO: "+todos los datos del turno
Cambiar: se ingresa por parametro la nueva fecha y hora del turno y se cambia los estados de los atributos correspondientes
Confirmar: muestra en consola "TURNO CONFIRMADO: "+todos los datos del turno. */

public class TurnosMedicos {
    private String fecha;
    private String hora;
    private String profesional;
    private String lugar;

    public TurnosMedicos() {
        this.fecha = "14/05/2020";
        this.hora = "15:30";
        this.profesional = "Carlos Sanchez";
        this.lugar = "Hospital Britanico";
    }

    String Cancelar() {
        return "TURNO CANCELADO " + this.fecha +" " + this.hora + " " + this.profesional + " " + this.lugar;
    }

    public void setCambiar(String newfecha, String newhora) {
        this.fecha = newfecha;
        this.hora = newhora;
    }

    public String toString() {
        return this.fecha +" " + this.hora + " " + this.profesional + " " + this.lugar;
    }

    public String Confirmar() {
        return "TURNO CONFIRMADO" + " " + this.fecha +" " + this.hora + " " + this.profesional + " " + this.lugar;
    }

}

