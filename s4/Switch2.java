import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Menú de opciones.
        System.out.print("""
                \t Selecciona una opción:\s
                \t 1) Opción 1
                \t 2) Opción 2
                \t 3) Opción 3
                \t =>\s""");

        opcion = entrada.nextInt(); entrada.nextLine();

        switch (opcion) { //Switch usando flechas lambda:
            case 1 -> System.out.println("\n\t Soy tu primera opción...");
            case 2 -> System.out.println("\n\t Soy tu segunda opción");
            case 3 -> System.out.println("\n\t Soy tu tercera opción");
            default -> System.out.println("\n\t Soy una opción no contemplada...");
        }

        entrada.close();

    }


}




