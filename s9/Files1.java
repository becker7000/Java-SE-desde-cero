import java.io.File;
import java.io.IOException;

public class Files1 {

    public static void main(String[] args) throws IOException {

        //Esto no genera un archivo, sino que solo
        //genera un objeto capaz de manipular, crear,
        //analizar, modificar, leer o borrar un archivo o directorio.
        File miArchivo = new File("nuevo.txt");

        //Otro truco para no tener que controlar la exception
        //es delegarla...
        if(!miArchivo.exists()){
            miArchivo.createNewFile();
        }

    }

}