package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(1, "pedro", "aee");

        Alumno alumno2 = new Alumno();

//        alumno1.setNombre("pedro");

        System.out.println(alumno1.getNombre());
    }
}
