package mx.com.gm.dao;

import jakarta.persistence.*;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Persona;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
//       } finally {
//            if (em != null) {
//                em.close();
//            }
        }
    }
    
    public Persona buscarPersonaPorId(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }
    
    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
       }
    }
}
