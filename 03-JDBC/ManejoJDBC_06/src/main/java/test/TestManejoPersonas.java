package test;

import datos.*;
import java.sql.*;
import domain.PersonaDTO;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        
        Connection conexion = null;
                
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.select();
            
            for (PersonaDTO persona : personas) {
                System.out.println("Persona DTO: " + persona);
            }
            
            conexion.commit();
            
            System.out.println("Se ha hecho commit de la transaccion");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
