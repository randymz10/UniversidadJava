package mx.com.gm.sga.cliente.jpql;

import java.util.*;
import javax.persistence.*;
import mx.com.gm.sga.domain.*;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. Consulta de todos los obejtos de tipo Persona
        log.debug("\n1. Consulta de todas las Personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //2. Consulta de la Persona con id = 1
        log.debug("\n consulta de la persona con id = 1");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);

        //3. Consulta de la Persona por nombre
        log.debug("\n Consulta de la persona por nombre");
        jpql = "select p from Persona p where p.nombre = 'Karla'";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //4. Consulta de datos individuales, secrea un arreglo(tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";

        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("nombre: " + nombre + ", apellido: " + apellido + ", email: " + email);

        }

        //5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas
        log.debug("\n. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("Objeto persona: " + persona);
            //log.debug("id persona: " + idPersona);
        }

        //6. Consulta de todas las personas
        System.out.println("\n Consulta de todas las personas");
        jpql = "select new mx.com.gm.sga.domain.Persona( p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //7. Regresa el valor minimo y maximo del idPersona (scaler result)
//        System.out.println("\n7. Regresa el valor minimo y maximo del idPersona (scaler result)");
//        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count (p.idPersona) as Contador from Persona p";
//        iter = em.createQuery(jpql).getResultList().iterator();
//        while(iter.hasNext()){
//            tupla = (Object[]) iter.next();
//            Integer idMin = (Integer) tupla[0];
//            Integer idMax = (Integer) tupla[1];
//            Long count = (Long) tupla[2];
//            log.debug("idMin: " + idMin + "idMax: " + idMax + "count: " + count);
//        }
//        //8. Cuenta los nombre de las personas que son distintos
//        log.debug("\n Cuenta los nombre de las personas que son distintos");
//        //jpql = "select count (distinc p.nombre) as Contador from Persona p";
//       // Long contador = (Long) em.createQuery(jpql).getSingleResult();
//      //  log.debug("no. de personas con nombres distintos: " + contador);
        //9. Concatena y convierte a Mayúsculas el nombre y el apellido
        log.debug("\n9. Concatena y convierte a Mayúsculas el nombre y el apellido");
        jpql = "select CONCAT(p.nombre, ' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for (String nombreCompleto : nombres) {
//            log.debug(nombreCompleto);
        }

        //10. Obtiene el objeto persona con id igual al parametro proporcionado
        log.debug("\n 10. Obtiene el objeto persona con id igual al parametro proporcionado");
        int idPersona = 1;
        jpql = "select p from Persona p where p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
////        log.debug(persona);

        //11. Obtiene las personas que contengan una letra A en el nombre sin importar si es mayuscula o minuscula
        log.debug("\n 11. Obtiene las personas que contengan una letra A en el nombre sin importar si es mayuscula o minuscula");
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        String parametroString = "%a%";// es el caracter que utilizamos para la sentencia like
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametroString);
        personas = q.getResultList();
//        mostrarPersonas(personas);

        //12. Uso de between
        log.debug("\n 12. Uso de between");
        jpql = "select p from Persona p where p.idPersona between 1 and 2";
        personas = em.createQuery(jpql).getResultList();
////        mostrarPersonas(personas);

        //13. Uso del ordenamiento
        log.debug("\n13. Uso del ordenamiento");
        jpql = "select p from Persona p where p.idPersona > 3 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //14. Uso de subquery
        log.debug("\n14. Uso de subquery");
        jpql = "select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1) ";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //15. Uso de join con lazy loading
        log.debug("\n1. Uso de join con lazy loading");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);
        
        //16. Uso de left join con eager loading
        log.debug("\n16. Uso de left join con eager loading");
        jpql = "select u from Usuario u left join fetch u.persona";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);

    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            log.debug(persona);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario: usuarios) {
            log.debug(usuario);
        }
    }
}
