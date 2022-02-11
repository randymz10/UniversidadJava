package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
