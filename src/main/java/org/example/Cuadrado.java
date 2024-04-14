package org.example;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
