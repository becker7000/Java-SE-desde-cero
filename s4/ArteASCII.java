import java.util.Scanner;

public class ArteASCII {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i=0,j,limite; //Scope global
        System.out.print("\n\t Cuantas filas? ");
        limite=entrada.nextInt(); entrada.nextLine();

        while(i<limite){
            System.out.print("\n\t\t"); //Salto de línea
            j=0;
            //int z=i+j; //scope local
            while(j<=i){
                System.out.print("\t *");
                j++;
            }
            i++;
        }

        // System.out.println(z); <- la z no sería reconocida.

        System.out.println();
        entrada.close();
    }

}
