/*
REYES ARROYO GAEL
TAREA #4 ASOCIACION
PROGRAMACION 2 
FECHA DE CREACION:09-11-22
ULTIMA MODIFICACION:19-11-22
*/

package com.mycompany.tarea4;

public class Persona {
   private String Nombre;
   private String Apaterno;
   private String Amaterno;
   private int indice;

    public Persona(String nombre, String paterno, String materno, int ind) {
        this.Nombre = nombre;
        this.Apaterno = paterno;
        this.Amaterno = materno;
        this.indice = ind;
        // debeeria de ir aqui la edad y no
    }
 
   public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }
   
}
