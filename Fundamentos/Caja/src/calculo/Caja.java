package calculo;

public class Caja {
    int ancho, alto, profundo;
    
    public Caja(){
        System.out.println("Ejecutanddo constructor vacio");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando contructor con argumentos");
    }
    
    public int calcularVolumen(){
        
        return  ancho*alto*profundo;
    }
}
