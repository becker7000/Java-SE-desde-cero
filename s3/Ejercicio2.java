import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Declaramos un scanner
        Scanner entrada = new Scanner(System.in);

        double masa, estatura, imc; // imc es el índice de masa corporal
        //Instrucciones:
        System.out.print("\n\t Dame tu masa (kilogramos): ");
        masa = entrada.nextDouble(); entrada.nextLine();
        System.out.print("\n\t Dame tu estatura (metros): ");
        estatura = entrada.nextDouble(); entrada.nextLine();

        //Linealizando una formula:
        //Calculos:
        imc = masa/(estatura*estatura);

        //Salidas:  El código de formato %f sirve para los double y float:
        System.out.printf("\n\t Tu índice de masa corporal es: %.3f",imc);

        //Buena práctica:
        entrada.close();
    }

}
