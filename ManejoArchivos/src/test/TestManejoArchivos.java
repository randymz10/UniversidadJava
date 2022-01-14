package test;

import manejoArchivos.ManejoArchivos.*;
import static manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";

//        ManejoArchivos.crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Adios");
        leerArchivo(nombreArchivo);
    }
}
