import java.util.Scanner;

public class IMCSofisticado {

    public static void main(String[] args) {
        //Declaramos un scanner
        //Atajo: para agregar la librería java.util.Scanner
        // podemos usar el comando: alt + enter .
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

        //Este código le dice al usuario que tal está su peso:
        if(imc<18.5){
            System.out.println("\n\t Tu peso está por debajo de lo normal.");
        }else if((imc>=18.5) && (imc<=24.9)){
            System.out.println("\n\t Tu peso está dentro de lo normal");
        }else if((imc>=25.0) && (imc<=29.9)){
            System.out.println("\n\t Tu peso está por encima de lo normal");
        }else{
            System.out.println("\n\t Tu peso está muy excedido");
        }

        //Buena práctica:
        entrada.close();
    }

}
