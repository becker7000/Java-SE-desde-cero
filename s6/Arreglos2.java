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
            System.out.printf("\n\n\t Nota %d: ",(i+1));
            calificaciones[i]= entrada.nextDouble(); entrada.nextLine();
            suma+=calificaciones[i];
        }

        promedio=suma/(calificaciones.length);
        System.out.printf("\n\t Tu promedio es: %.2f",promedio);

        double menor, mayor;
        //Suponemos que el elemento menor es el primer elemento del arreglo:
        //hasta probar lo contrario:
        menor=calificaciones[0];
        mayor=calificaciones[0];

        // calificaciones = { 9.2, 8.7, 9.5, 8.1, 9.9}

        for (int i = 0; i < calificaciones.length; i++) {
            if(menor>calificaciones[i]){
                menor=calificaciones[i];
                //El valor de la variable 'menor' va a cambiar
                //hasta que guarde el elemento menor.
            }
            if(mayor<calificaciones[i]){
                mayor=calificaciones[i];
                //El valor de la variable 'mayor' va a cambiar
                //hasta que guarde el elemento mayor.
            }
        }

        System.out.printf("\n\t La calificación más baja fue: %.2f",menor);
        System.out.printf("\n\t La calificación más alta fue: %.2f",mayor);

        entrada.close();
    }

}
