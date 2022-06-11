import java.io.File;

public class AnalizadorDirectorio {

    public static void main(String[] args) {

        // Paso 1: creamos una instancia de la clase File
        File file = new File("C:\\Users\\Erick\\Documents\\Java Standard Edition\\Codes");

        // Paso 2: creamos un arreglo de todos los archivos o directorios
        // contenidos en la carpeta "codes" con el método listFiles().
        File[] listaDeArchivos=file.listFiles();

        // Paso 3: con un ciclo foreach recorremos el arreglo
        // para imprimirlo en la consola.
        for(File archivo : listaDeArchivos){
            System.out.print("\n\t "+archivo);
        }

    }

}
