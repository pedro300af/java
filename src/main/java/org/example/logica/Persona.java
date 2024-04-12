package org.example.logica;

public class Persona {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String domocilio;
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String dni, String nombre, String apellido, String domocilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domocilio = domocilio;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomocilio() {
        return domocilio;
    }

    public void setDomocilio(String domocilio) {
        this.domocilio = domocilio;
    }

    public String  bailar(){
        return "la persona baila";
    }
}
