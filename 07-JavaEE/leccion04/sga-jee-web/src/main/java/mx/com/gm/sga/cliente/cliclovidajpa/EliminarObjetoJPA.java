package mx.com.gm.sga.cliente.cliclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutamos SQL de tipo select
        Persona persona1 = em.find(Persona.class, 4);

        //Paso 3. Termina la trasacción 1
        tx.commit();

        //Objeto en estado de detached
        log.debug("Objeto encontrado: " + persona1);

        //Paso 4. Iniciamo trasaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        //Paso 5. Ejecuta SQL de tipo delete
        em.remove(em.merge(persona1));

        //Paso 6. Termina la transacción 2
        tx2.commit();

        log.debug("Objeto eliminado: " + persona1);

        //Cerramos el entity manager
        em.close();

    }
}
