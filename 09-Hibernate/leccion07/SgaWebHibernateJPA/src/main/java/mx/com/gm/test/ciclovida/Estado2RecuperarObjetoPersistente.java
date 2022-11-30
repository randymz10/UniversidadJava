package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Definimos la variable
        Contacto contacto = null;
        
        //2. Recuperar un objeto de la base de datos 
        contacto = em.find(Contacto.class, 3);
        
        //3. Detached
        System.out.println("contacto = " + contacto);
        
    }
}
