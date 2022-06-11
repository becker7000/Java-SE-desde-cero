import java.io.File; //Librería para clase File
import java.io.IOException;

public class Archivos2 {

    public static void main(String[] args) {

        /*
        * Esta clase nos ayuda a generar un objeto de tipo File:
        * File puede crear, analizar, modificar, leer, etc...
        * */
        File miArchivo = new File("miArchivo.txt");

        // El método exists() devuelve un verdadero si el archivo
        // existe y devuelve un falso si archivo no existe.
        if(!miArchivo.exists()){
            //Controlamos un posible fallo en el flujo...
            try {
                miArchivo.createNewFile();
            } catch (IOException exception) {
                System.out.println("\n\t No se pudo crear el archivo...");
                System.out.println("\n\t "+exception.getMessage());
            }
        }

    }

}
