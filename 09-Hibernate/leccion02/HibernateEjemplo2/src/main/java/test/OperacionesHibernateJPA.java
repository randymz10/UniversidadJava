package test;

import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(5);
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("Se ha encontrado la persona" + persona);

//        persona.setNombre("Carlos");
//        persona.setApellido("Esparza");
//        persona.setEmail("cesparza@mail.com");
//        persona.setTelefono("55664422");
//        personaDao.insertar(persona);
//        personaDao.modificar(persona);
        personaDao.eliminar(persona);
        
        personaDao.listar();
    }
}
