import java.util.Scanner;

public class Arreglos2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\tCuantas calificaciones? ");
        final int cantidad = entrada.nextInt(); entrada.nextLine();
        double[] calificaciones = new double[cantidad];
        System.out.printf("\n\tDame tus %d calificaciones: ",cantidad);

        double suma=0,promedio;

        for(int i=0; i<calificaciones.length; i++){
            System.out.printf("\n\t Nota %d: ",(i+1));
            calificaciones[i]= entrada.nextDouble(); entrada.nextLine();
            suma+=calificaciones[i];
        }

        promedio=suma/(calificaciones.length);

        System.out.printf("\n\t Tu promedio es: %.2f",promedio);

        entrada.close();
    }

}
