package org.example.logica;

public class Empleado extends Persona{
    private int numLegajo;
    private String cargo;
    double suedo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domocilio, String telefono, int numLegajo, String cargo, double suedo) {
        super(id, dni, nombre, apellido, domocilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.suedo = suedo;
    }

    @Override
    public String bailar() {
        return "el empleado baila" + super.bailar();
    }
}
