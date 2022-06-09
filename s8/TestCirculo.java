import java.util.ArrayList;

public class TestCirculo {

    //Punto de ejecución:
    public static void main(String[] args) {

        //Todavía no hemos creado ningún círculo:
        //Circulo.mostrarCuantosCirculos();

        //Creando un objeto de clase Circulo (instanciando la clase Circulo)
        Circulo c1= new Circulo(5.4);

        //Volvemos a llamar al método estático:
        //Circulo.mostrarCuantosCirculos();

        //Usando los métodos de la clase Circulo
        //System.out.printf("\n\t Radio: %.3f",c1.getRadio());
        //c1.calcularArea();
        //c1.calcularPerimetro();

        //Creando un segundo círculo:
        Circulo c2 = new Circulo(7.1);
        //c2.calcularArea();

        //Creando un tercer círculo:
        Circulo c3 = new Circulo(11.5);

        //Creando una lista de Círculos:
        ArrayList<Circulo> circulos = new ArrayList<>();
        circulos.add(c1);
        circulos.add(c2);
        circulos.add(c3);

        for (int i = 0; i < circulos.size(); i++) {
            System.out.print("\n\t+---------------------------+");
            System.out.printf("\n\t Círculo #%d con radio: %.3f",(i+1),circulos.get(i).getRadio());
            circulos.get(i).calcularArea();
            circulos.get(i).calcularPerimetro();
            System.out.print("\n\t+---------------------------+");
        }

        //Usando otra vez el método estático:
        Circulo.mostrarCuantosCirculos();

    }

}

