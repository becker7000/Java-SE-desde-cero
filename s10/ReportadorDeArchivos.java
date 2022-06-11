import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReportadorDeArchivos {

    // path es el nombre o ruta del archivo
    // usamos el nombre si el archivo está en la misma carpeta
    // que nuestro analizador en caso contrario usamos la ruta absoluta.
    private String path;

    //El constructor sólo requere la ruta del archivo el nombre
    //para hacer el reporte.
    public ReportadorDeArchivos(String path) {
        this.path = path;
    }

    public void generarReporte() throws FileNotFoundException {

        File file = new File(this.path);

        //Obtenemos el nombre del archivo con getName():
        System.out.printf("\n\t Nombre: %s",file.getName());

        //Obtenemos la ruta absoluta del archivo con getAbsolutePath():
        System.out.printf("\n\t Ruta: %s",file.getAbsolutePath());

        //Preguntamos a Java si el archivo existe con exist():
        System.out.printf("\n\t Existe el archivo? R: %s",((file.exists())?"Sí existe":"No existe"));

        //Preguntamos a Java si el archivo es un archivo o no con isFile():
        System.out.printf("\n\t Es un archivo? R: %s",((file.isFile())?"Sí es archivo":"No es archivo"));

        //Preguntamos a Java si el archivo se puede leer o no con canRead():
        System.out.printf("\n\t Se puede leer? R: %s",((file.canRead())?"Sí se puede leer":"No se puede leer"));

        //Ahora vamos a contar en número de líneas contenidas en el archivo:
        int contador=0;
        Scanner scanner = new Scanner(file);
        //Nota: la línea anterior puede generar una exception por lo tanto
        // la delegamos o propagamos con throws...


        //Preguntamos si archivo tiene una siguiente línea con scanner.hasNextLine()
        while(scanner.hasNextLine()){
            scanner.nextLine();
            contador++;
        }

        System.out.printf("\n\t Total de líneas del archivo: %d",contador);

        scanner.close();
    }




}
