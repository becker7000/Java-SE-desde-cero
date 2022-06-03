public class Dado {

    public static void main(String[] args) {

        // 0.9*6=5.4 -> 5
        // 0,1,2,3,4,5
        int dado = (int)(Math.random()*6);

        switch (dado){
            case 0 -> System.out.println("\n\t"+DadoTexto.UNO);
            case 1 -> System.out.println("\n\t"+DadoTexto.DOS);
            case 2 -> System.out.println("\n\t"+DadoTexto.TRES);
            case 3 -> System.out.println("\n\t"+DadoTexto.CUATRO);
            case 4 -> System.out.println("\n\t"+DadoTexto.CINCO);
            case 5 -> System.out.println("\n\t"+DadoTexto.SEIS);
        } // Este switch no requiere default
        // ya que forzamos a que el dado siempre tenga
        // un valor entero entre 0 y 5.

    }

}
