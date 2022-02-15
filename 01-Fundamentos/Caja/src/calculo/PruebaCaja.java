package calculo;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja = new Caja();
        
        caja.ancho = 3;
        caja.alto = 2;
        caja.profundo = 6; 
        
        int volumen = caja.calcularVolumen();
        System.out.println("volumen = " + volumen);
        
        Caja caja1 = new Caja( 3, 2, 6);
        
        System.out.println("Volumen = " + caja.calcularVolumen());
    }
}
