package org.example;

import org.example.logica.Empleado;
import org.example.logica.Jefe;
import org.example.logica.Persona;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println(empleado.bailar());


        List<Persona> personas = new ArrayList<>();

        personas.add(new Empleado());
        personas.add(new Jefe());
        personas.add(new Jefe());

        for (Persona persona : personas){
            System.out.println(persona.bailar());
        }
    }
}
