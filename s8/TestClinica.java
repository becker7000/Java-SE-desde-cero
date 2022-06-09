
public class TestClinica {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Eduardo","Rojas","Cardiología");
        Doctor d2 = new Doctor("Valeria","Lopez","Neurología");

        Paciente p1 = new Paciente("Laura","Gomez","Dolor de cabeza");
        Paciente p2 = new Paciente("Eder","Martinez","Cuerpo cortado");

        d1.mostrar();
        d2.mostrar();
        p1.mostrar();
        p2.mostrar();


    }

}
