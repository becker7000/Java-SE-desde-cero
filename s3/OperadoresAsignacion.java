public class OperadoresAsignacion {

    public static void main(String[] args) {

        int ahorro=0; //Domingo

        ahorro+=100; // Lunes -> 100
        ahorro+=50;  // Martes -> 150
        ahorro+=80;  // Miércoles -> 230
        ahorro+=100; // Jueves -> 330
        ahorro*=2;   // Viernes -> 660
        // se duplica el acumulado entre lunes y jueves

        //System.out.printf("\n\t Ahorro: %d",ahorro);
        //atajo: ctrl+D duplica la línea hacia abajo.
        System.out.println("\n\t Ahorro: "+ahorro);
    }

}
