import java.util.Scanner; //Agrega la clase Scanner

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creamos un objeto de tipo Scanner
        Scanner entrada = new Scanner(System.in);

        //Datos de entrada:
        System.out.print("\n\t Introduce los segundos de entrada: ");
        //Cerramos la línea con entrada.nextLine(); <- es un buena práctica:
        int segundos_ent = entrada.nextInt(); entrada.nextLine();

        //Cálculos:
        int minutos,segundos;
        minutos=segundos_ent/60; // 400 -> 400/60 = 6 minutos, 400%60 = 40 segundos
        segundos=segundos_ent%60;

        //Salidas:
        // Las secuncias de escape nos sirven para imprimir caracteres del
        // código ASCII que son especiales, tales como los invisibles
        // (espacio o un salto de línea).
        System.out.printf("\n\t Los segundos de entrada son equivalentes a: " +
                          "\n\t %d minutos con %d segundos.",minutos,segundos);

        //Buena práctica de Java: cerrar el Scanner
        entrada.close();
    }

}

/*
*  Operador resto (módulo o mudulus).
*
*   20%6=2
*   17%4=1
*   23%8=7
*   30%12=6
*
* */
