public class For {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++ ){ //Math.pow nos da un double, entonces lo transformamos a entero.
            System.out.printf("\n\t 2^%d = %d",i,(int)Math.pow(2,i));
        }

    }

}
