import java.util.Scanner;

public class SumaGauss {

    // n=100 -> 1+2+3+...+98+99+100=5050
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma=0;
        int contador=1;
        int limite;

        System.out.print("\n\t Sumar del 1 hasta el: ");
        limite= scanner.nextInt(); scanner.nextLine();

        while(contador<=limite){
            suma+=contador;
            contador++;
        }

        System.out.println("\n\t El valor de la suma es: "+suma);

        scanner.close();
    }

}

/*
*  cont=1, sum=0
*  -------------
*  cont<=100 ? sí
*  sum=1+0=1
*  cont=1+1=2 incremento
*  -------------
*  cont<=100 ? sí
*  sum=1+2=3
*  cont=2+1=3 incremento
*  -------------
*  cont<=100 ? sí
*  sum=3+3=6
*  cont=3+1=4 incremento
*
* */

// 1+2+3+4=10
// 1+2=3