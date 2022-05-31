public class Variables2 {

    public static void main(String[] args) {

    //Datos de entrada:
    int a=10, b=20, c=4;

    //Procedimientos:
    a=a+3; // a = 13
    b=b+4-a; // b = 20+4-13 = 11
    c=a+b+c; // c = 13+11+4 = 28
    a=a+c; // a = 13+28 = 41
    b=4; // b = 4 (reasignación)
    c=c+3-b+2; // c = 28+3-4+2 = 29

    //Datos de salida:
    System.out.println(" a = "+a+", " +
                        "b = "+b+"" +
                        " y c = "+c);

    }

}
