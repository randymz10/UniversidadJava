package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto( "Camisa", 50.00);
        Producto producto1 = new Producto("Pantalon", 10.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto1);
        orden1.mostrarOrden();
    }
}
