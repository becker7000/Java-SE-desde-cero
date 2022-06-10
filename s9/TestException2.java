public class TestException2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0; //

        try{
            System.out.printf("\n\t División: %d",(a/b));
        }catch (ArithmeticException exception){
            System.out.print("\n\t Error por dividir por cero: "+exception.getMessage());
            //exception.printStackTrace();
        }finally { //Finally es opcional
            System.out.println("\n\t Excepción controlada");
        }


    }

}
