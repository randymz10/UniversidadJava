package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "5533442");

//        personaDao.insertar(personaNueva);

        //Modificando un objeto de tipo persona existente
        
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "22334455");
//        personaDao.actualizar(personaModificar);

        //Eliminando un objeto
        
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
//      Listado de personas
        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }

    }
}

        