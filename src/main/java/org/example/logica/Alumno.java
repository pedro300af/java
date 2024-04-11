package org.example.logica;

public class Alumno {
    private int id;
    private String apellido;

    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: ");
    }

    public void saberAprobado(double calificacion){
        if (calificacion >= 6){
            System.out.println("aprobe la materia");
        }else {
            System.out.println("uyy no aprobe");
        }
    }
}
