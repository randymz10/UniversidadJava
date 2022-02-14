package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println(""
                    + "1. Listar\n"
                    + "2. Insertar\n"
                    + "3. Actualizar\n"
                    + "4. Eliminar\n"
                    + "5. Salir");
            System.out.println("Escribe una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    List<Usuario> usuarios = usuarioJDBC.seleccionar();
                    for (Usuario usuario : usuarios) {
                        System.out.println("usuario = " + usuario);
                    }
                    break;

                case 2:
                    Usuario insertarUsuario = new Usuario();
                    System.out.println("Inserte el username");
                    insertarUsuario.setUsername(scanner.next());
                    
                    System.out.println("Inserte el password");
                    insertarUsuario.setPassword(scanner.next());
                    
                    usuarioJDBC.insertar(insertarUsuario);
                    break;
                    
                case 3:
                    Usuario usuarioActualizar = new Usuario();
                    System.out.println("Inserte el id de la persona a modificar: ");
                    usuarioActualizar.setIdUsuario(scanner.nextInt());
                    
                    System.out.println("Inserte el username de la persona a modificar: ");
                    usuarioActualizar.setUsername(scanner.next());
                    
                    System.out.println("Inserte el password de la persona a modificar: ");
                    usuarioActualizar.setPassword(scanner.next());
                    
                    usuarioJDBC.actualizar(usuarioActualizar);
                    
            }
        }
    }
}
