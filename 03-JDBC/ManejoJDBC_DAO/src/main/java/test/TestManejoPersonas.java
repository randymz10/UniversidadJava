package test;

import datos.*;
import java.sql.*;
import domain.Persona;

public class TestManejoPersonas {

    public static void main(String[] args) {
        
        Connection conexion = null;
                
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karala Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@");
            cambioPersona.setTelefono("22334455");
            personaJDBC.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            
            personaJDBC.insertar(nuevaPersona);
            
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
