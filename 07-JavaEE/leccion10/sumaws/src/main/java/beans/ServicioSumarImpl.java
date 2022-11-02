package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumaWS")
public class ServicioSumarImpl implements ServicioSumaWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
}
