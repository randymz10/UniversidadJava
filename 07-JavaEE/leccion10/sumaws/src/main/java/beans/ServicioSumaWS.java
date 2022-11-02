package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServicioSumaWS {
    
    @WebMethod
    public int sumar(int a, int b);
}
