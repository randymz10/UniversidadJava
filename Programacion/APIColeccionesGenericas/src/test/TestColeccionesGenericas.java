package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List <String>  miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        imprimir(miLista);
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Mierccoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        imprimir(miSet);
    }
    
    public static void imprimir(Collection coleccion ){
        for (Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}
