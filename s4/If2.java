import java.util.Scanner;

public class If2 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        // Los primitivos van con puras minúsculas (int, double)
        // en cambio los objetos inician con mayúsculas (String, Scanner, StringBulder)
        String password="12345a"; // 6 bytes

        System.out.print("\n\t Escribe tu contraseña para entrar al sistema: ");
        //Instrucción para guardar una cadena:
        String passEntrada = entrada.nextLine();

        if(passEntrada.equals(password)){
            System.out.println("\n\t Bienvenid@ al sistema...");
        }else{
            System.out.println("\n\t Acceso denegado!");
        }


        entrada.close();
    }

}
