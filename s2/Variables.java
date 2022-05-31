public class Variables {

    //Esto es un comentario en Java

    /*
    * Este es un
    * comentario de
    * muchas
    * líneas.
    * */

    /**
     * Este comentario siempre va antes de una función o
     * un método para que al momento de pasar el mouse o el
     * cursor por encima del nombre de la función ésta
     * despliegue un menú autodescriptivo.
     */
    public int sumar(int x, int y){
        return x+y;
    }

    //Atajo: main
    public static void main(String[] args) {

        //Atajo: sout
        System.out.println("Hola a todos desde IntelliJ IDEA");

        //Reglas para definir las variables en Java:
        //Java es fuertemente tipado (aunque podemos usar var y no tipar)
        int num_uno;
        int altura_especial; //Es la altura de cada persona
        altura_especial=178;
        // Altura_especial=185; <- esto daría un error por el case sensitive.


        /*
        *   Estilos de nombramiento de variables, constantes y funciones:
        *
        *   camell case: numUno  -> funciones o variables
        *   snake case: num_uno  -> variables
        *   pascal case: NumUno  -> clases
        *
        *   Las constantes es una buena practica nombrarlas con puras mayúsculas:
        *   E=2.71 , PI=3.1415926535, PHI = 1.6261, G=9.81, IVA=16
        *
        * */

    }


}

/*
*   Nota: no todas las clases en Java son ejecutables.
*   para lo sean deberan tener un punto de ejecución:
*   (public static void main...) pero de hecho no necesitamos
*   que todas las clases sean ejecutables.
* */
