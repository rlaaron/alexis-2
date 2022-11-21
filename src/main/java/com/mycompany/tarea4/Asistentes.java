package com.mycompany.tarea4;

public class Asistentes extends Persona{
private int edad;
private String universidad;

    public Asistentes(String nombre, String paterno, String materno, int ind, int edad, String univers) {
        super(nombre, paterno, materno, ind);
        this.edad = edad;
        this.universidad = univers;
        // deberia ir aqui el id y no la edad
    }
   
    // public Asistentes() {
    // }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Asistentes{ nombre: " + super.getNombre() + "id = " + super.getIndice() + "edad=" + edad + ", universidad=" + universidad + '}';
    }
    
}
