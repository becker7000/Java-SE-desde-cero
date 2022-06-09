public class Circulo {

    private double radio;
    private final double PI = 3.1415926535;
    //Nota: las variable y método estaticos se usan
    //para no tener que instanciar una clase.
    public static int cuantosCirculos=0;

    //Constructor de la clase Circulo:
    public Circulo(double radio) {
        this.radio = radio;
        cuantosCirculos++;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio=radio;
    }

    //Todos lo método siempre tienen acceso a los atributos.
    public void calcularArea(){
        double area=PI*Math.pow(radio,2);
        System.out.printf("\n\t Área: %.3f",area);
    }

    public void calcularPerimetro(){
        double perimetro=PI*radio*2;
        System.out.printf("\n\t Perímetro: %.3f",perimetro);
    }

    //Este método no requiere ningún objeto para mandarse a llamar:
    public static void mostrarCuantosCirculos(){
        System.out.printf("\n\t Cantidad de círculos: %d",cuantosCirculos);
    }

}
