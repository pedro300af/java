package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "pedro1", 27));
        lista.add(new Persona(2, "pedro2", 27));
        lista.add(new Persona(3, "pedro3", 27));
        lista.add(new Persona(4, "pedro4", 27));
        lista.add(new Persona(5, "pedro5", 27));

        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
    }
}
