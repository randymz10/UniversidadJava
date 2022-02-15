package accesodatos;

public class ImplemetacionMySQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde SQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde SQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde SQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde SQL");
    }
    
}
