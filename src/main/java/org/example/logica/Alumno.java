package org.example.logica;

public class Alumno {
    private int id;
    private String apellido;

    public Alumno() {

    }

    public Alumno(int id, String apellido) {
        this.id = id;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: " + apellido);
    }

    public void saberAprobado(double calificacion){
        if (calificacion >= 6){
            System.out.println("aprobe la materia");
        }else {
            System.out.println("uyy no aprobe");
        }
    }
}
