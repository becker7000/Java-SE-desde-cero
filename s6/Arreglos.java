import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {

        //Sintáxis para un arreglo:
        int[] numeros = new int[5];
        // Tamaño del arreglo: 5

//        numeros[0]=7;
//        numeros[1]=8;
//        numeros[2]=5;
//        numeros[3]=6;
//        numeros[4]=2;

        //Nota: el método length nos devuelve el tamaño del arreglo:
        for(int i = 0; i< numeros.length; i++){
            //Llenando el arreglo de número aleatorios entre 1 y 10:
            numeros[i]=(int)(Math.random()*10+1);
            System.out.printf("\n\t numeros[%d] = %d",i,numeros[i]);
        }

    }

}
