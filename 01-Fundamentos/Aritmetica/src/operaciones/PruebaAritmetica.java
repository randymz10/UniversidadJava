
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales 
        var a = 10;
        var b = 10;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica 1 " + aritmetica1.a);
        System.out.println("Aritmetica 1 " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica 2 " + aritmetica2.a);
        System.out.println("Aritmetica 2 " + aritmetica2.b);
    }
    
    public static void miMetodo(){
        //Variable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("Otro metodo");
    }
}
