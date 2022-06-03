public class While {

    public static void main(String[] args) {

        //Para while usamos 3 cosas:
        //  1) Variable de control i=0
        //  2) Una condición de iteración (repetición) i<10
        //  3) Incremento i++

        /*
        * Usamos while cuando sabemos en que momento ya no
        * hay que repetir, pero no necesariamente el número
        * exacto de repeticiones.
        * */

        int i=1; //Variable de control

        while(i<=10){ //Condición
            System.out.printf("\n\t i = %d",i);
            i++; //Incremento
        }

        // Ciclar quiere decir que el bucle repite infinitamente...
    }

}

/*
*   Discreto quiere decir finito contable, ejemplo: 1,2,3,4,5...
*   Contínuo quiere decir que no se puede contar y es infinito: tiempo.
* */
