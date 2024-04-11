package org.example;

import org.example.logica.Alumno;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(1, "Arriaga");
        alumno1.saberAprobado(5);
        alumno1.mostrarNombre();
    }
}
