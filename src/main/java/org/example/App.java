package org.example;

import org.example.logica.Empleado;
import org.example.logica.Persona;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println(empleado.bailar());
    }
}
