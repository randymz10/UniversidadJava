package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 10;
        edades[1][1] = 4;
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j <edades[i].length; j++) {
                System.out.println("edades " +  i + j + "= " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"},{"Fresa", "Zarzamora", "Mora"}};
        
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona ("Juan");
        personas[0][1] = new Persona ("Karla");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i +" - " + j + " = " + matriz[i][j]);
            }
        }
    }
}
