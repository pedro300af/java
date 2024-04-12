package org.example.logica;

public class Jefe extends Persona{
    private int id;
    private String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domocilio, String telefono, int id1, String departamentoJefe) {
        super(id, dni, nombre, apellido, domocilio, telefono);
        this.id = id1;
        this.departamentoJefe = departamentoJefe;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }

    @Override
    public String bailar() {
        return "el feje baila";
    }
}
