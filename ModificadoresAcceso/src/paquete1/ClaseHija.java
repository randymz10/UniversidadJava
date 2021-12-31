package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super();
        this.atributoProtegido = "Modificacion atributo protegido";
        System.out.println("atributoProtegido = " + this.atributoProtegido);
        this.metodoProtegido();
    }
    
}
