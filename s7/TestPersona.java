public class TestPersona {

    public static void main(String[] args) {

        // Creando instancias de la clase persona
        // Objetos de la clase Persona
        Persona p1 = new Persona("Luis","5512345678",50);
        Persona p2 = new Persona("Karla","5598765432",24);
        Persona p3 = new Persona("Eduardo","5519287346",35);
        Persona p4 = new Persona("Ana","5512338918",42);
        Persona p5 = new Persona("Edith","5598128822",39);

        //Aplicando el método mostrarPersona a todos objetos creados:
        p1.mostrarPersona();
        p2.mostrarPersona();
        p3.mostrarPersona();
        p4.mostrarPersona();
        p5.mostrarPersona();

    }

}
