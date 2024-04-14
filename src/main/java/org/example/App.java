package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(4);
        System.out.println(circulo1.calcularArea());

        circulo1.dibujable();
    }
}
