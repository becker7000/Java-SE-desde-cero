public class TestException1 {

    public static void main(String[] args) {

        String sSueldo="d2000";
        try{
            double dSueldo=Double.parseDouble(sSueldo);
            System.out.printf("\n\t El sueldo es: %.2f",dSueldo);
        }catch (NumberFormatException exception){
            System.out.print("\n\t Error en el tratamiento de datos: "+exception.getMessage());
        }

        System.out.println("\n\t Flujo controlado");

    }

}
