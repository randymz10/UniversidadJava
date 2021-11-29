package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a, b;
    
    
    //Constructorvacio
    
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //Sobrecarga de argumentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos ");
    }
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
       /* int resultado = a + b;
        return resultado;*/
       
       return a + b;
    }
    
    public int sumarConArgumentoss(int a, int b){
       /* a = arg1;
        b = arg2;        
        //return a + b; */
       
       this.a = a;
       this.b = b;
       return sumarConRetorno(); 
    }
}
