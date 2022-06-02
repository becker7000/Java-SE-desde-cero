import java.sql.SQLType;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Menú de opciones.
        System.out.print("\n\t Selecciona una opción: " +
                         "\n\t 1) Opción 1" +
                         "\n\t 2) Opción 2" +
                         "\n\t 3) Opción 3" +
                         "\n\t => ");

        opcion = entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1:
                System.out.println("\n\t Soy tu primera opción...");
                break;
            case 2:
                System.out.println("\n\t Soy tu segunda opción");
                break;
            case 3:
                System.out.println("\n\t Soy tu tercera opción");
                break;
            default:
                System.out.println("\n\t Soy una opción no contemplada...");
        }

        entrada.close();
    }

}
