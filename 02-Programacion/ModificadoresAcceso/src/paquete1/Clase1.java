package paquete1;

public class Clase1 {
    protected String atributoProtegido = "valor atributo protegido";
    
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    
    protected Clase1(){
        System.out.println("Constructor protegido");
    }
    
    protected void metodoProtegido(){
        System.out.println("Metodo protegido");
        
    }
    
}
