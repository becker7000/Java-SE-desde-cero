public class Ternario {

    public static void main(String[] args) {

        int num = 18;

        //Sintáxis: (Condicion)? Sentencia1 : Sentencia2;
        String isMultiploDe3 = (num%3==0)?
                "\n\tSí es múltiplo de 3"
                : "\n\tNo es múltiplo de 3";

        System.out.println(isMultiploDe3);

    }

}
