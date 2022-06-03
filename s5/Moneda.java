public class Moneda {

    public static void main(String[] args) {

        int moneda; // SOL o ÁGUILA

        /*
        * Math.random() nos devuelve un número aletorio de tipo double
        * y este número está en el intervalo [0,1).
        *
        * Coerción significa cambiar de un tipo de dato (primitivo) a otro
        * hay dos tipos de coerción (casting) la coerción explícita y la coerción implícita
        * la explícita la hacemos nosotros como vemos en la siguiente línea de código
        * en cambio la coerción implícita la hace Java de forma automática.
        *
        * */
        moneda=(int)(Math.random()*2); //Al multiplicarlo * 2  ahora dará un valor entre
        // 0.0 y 1.9   -> 0.3*2=0.6, 0.7*2=1.4

        if(moneda==0){
            System.out.println("\n\t "+MonedaTexto.SOL);
        }else{
            System.out.println("\n\t "+MonedaTexto.ÁGUILA);
        }

    }


}
