package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 30;
        
        for (int i = 0; i < edades.length; i++) {
         System.out.println("edades " + i + " = " + edades[i]);   
         
        }
        
        //Sintaxis simplificada
         
         String frutas[] = {"Naranja", "Platano", "Uva"};
         for (int i = 0; i < frutas.length; i++) {
             System.out.println("Frutas " + frutas[i]);
        }
    }
    
}
