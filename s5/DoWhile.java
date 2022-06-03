import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad;

        //Recomendación: usarlo como un filtro.
        do{ //Filtro númerico para un rango del 1 al 99.
            System.out.print("\n\t Dame tu edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();
        }while(edad<=0 || edad>=100);

        System.out.println("\n\t Tu edad: "+edad);

        scanner.close();

    }

}
