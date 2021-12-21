package test;

public class TestArgumentosariables {
    public static void main(String[] args) {
        imprimirNumeros(2, 3, 5);
        imprimirNumeros(1, 2); 
        
        variosParametros("Juan", 8, 9 , 10);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}

