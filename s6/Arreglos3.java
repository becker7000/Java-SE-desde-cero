public class Arreglos3 {

    public static void main(String[] args) {

        // 0,1,2,3,4,5,6,7
        String[] frutas = {"Manzana","Platano","Papaya",
                "Melón","Sandía","Mango","Kiwi","Fresa"};

        System.out.print("\n\t Conjunto de frutas: ");
        // Sintáxis de foreach (variable propuesta : arreglo)
        for (String fruta : frutas) { //la variable fruta sólo es conocida dentro del for.
            System.out.print(" "+fruta);
        }

        //Algoritmo para generar cocteles aleatorios de 3 frutas
        //a partir de un conjunto de frutas.

        //Generamos 3 números aleatorios entre 0 y 7
        //cada uno lo guardamos en una variable:

        int a,b,c;
        a=(int)(Math.random()*8);
        b=(int)(Math.random()*8);
        c=(int)(Math.random()*8);

        System.out.printf("\n\t " +
                "Combinación del día: [%s]-[%s]-[%s] ",
                frutas[a],frutas[b],frutas[c]);

    }

}

/*
* Reto 1: hacer que las frutas no salgan repetidas.
* Reto 2: agregar una expresión matemática que calcule la cantidad
*         de difentes combinaciones que se pueden generar sin importar
*         la cantidad de frutas existentes en el arreglo.
* */