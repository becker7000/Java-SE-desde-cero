import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        //Nota: las listas van en plural:
        // Ejemplo: paises, personas, clientes,
        // autos, telefonos... (la variables en cambio van en singular.
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Alejandro");
        nombres.add("Leticia");
        nombres.add("Marco");
        nombres.add("Laura");
        nombres.add("Lalo");
        // System.out.println(nombres); //Imprime el arreglo junto

        //Forma fácil (foreach)
        System.out.println("\n\t Usando foreach:");
        for (String nombre: nombres) {
            if(nombre.equals("Laura")){
                continue; //Salta a la siguiente iteración.
            }
            System.out.printf("\n\t %s",nombre);
        }

        //Forma compleja (for)
        System.out.println("\n\n\t Usando for:");
        // Para obtener el tamaño de un arreglo usamos .length()
        // Para obtener el tamaño de un ArrayList usamos .size()
        for (int i = 0; i < nombres.size(); i++) {
            if(i==3){
                continue; //Salta a la siguiente iteración
            }
            System.out.printf("\n\t %d) %s",(i+1),nombres.get(i));
        }

    }

}
