package org.example;

public class Circulo implements Figura, IDibujable, IRotable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return 3.14 * radio * radio;
    }

    @Override
    public void dibujable() {
        System.out.println("es dibujable");
    }

    @Override
    public void rotable() {
        System.out.println("es rotable");
    }
}
