package org.example;

public class Cuadrado implements Figura, IDibujable{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujable() {
        System.out.println("es dibujable");
    }
}
