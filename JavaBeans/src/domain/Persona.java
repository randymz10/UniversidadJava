package domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
    
    
}
