package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWS;
import java.util.List;

public class TestPersonaServiceWs {
    public static void main(String[] args) {
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        List<Persona> personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona idPersona: " + persona.getIdPersona() + ", nombre: " + persona.getNombre()
            + ", apellido: " + persona.getApellido() + ", email: " + persona.getEmail());
        }
        System.out.println("Fin servicio listar personas");
    }
}
