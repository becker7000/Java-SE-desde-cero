public class IfElse {

    public static void main(String[] args) {

        int edad=14;
        double altura=1.8;

        // {...,4,5,6,...,16,17} <-else {18,19,20,...} <-if
//        if(edad>18){ //if's encadenados...
//            System.out.println("\n\t Puedes volver votar!");
//        }else if(edad<18){
//            System.out.println("\n\t Aún no puedes votar!");
//        }else{
//            System.out.println("\n\t Puedes votar por primera vez!");
//        }

        if(edad>=18){ // if's anidados...
            System.out.print("\n\t Eres mayor de edad");
            if(altura>=1.5){
                System.out.print("y cumples con la altura, puedes subir.");
            }else{
                System.out.print(", pero no cumples con la altura, no puedes subir.");
            }
        }else{
            System.out.print("\n\t Lo sentimos no puede subir");
        }


    }

}
