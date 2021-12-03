package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan");
        System.out.println("persona = " + persona);
        
        Persona persona2 = new Persona("Karla");
        System.out.println("persona2 = " + persona2);
        
        imprimir(persona);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir (new Persona("Juan"));
        return this.contador;
    }
}
