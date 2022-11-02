package testclientews;

import clientews.servicio.ServicioSumaWS;
import clientews.servicio.ServicioSumarImplService;

public class TestServicioSumarWS {
    public static void main(String[] args) {
        
        ServicioSumaWS servicioSumarWS = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutar Servicio sumar WS");
        
        int x = 3;
        int y = 6; 
        
        int resultado = servicioSumarWS.sumar(x, y);
        
        System.out.println("Resultado = " + resultado);
        System.out.println("Fin del servicio sumar WS");
    }
}
