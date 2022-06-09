public class Persona {

    //Atributos:
    private String nombre;
    private String telefono;
    private int edad;

    //Contructor: los contructores llevan el mismo nombre de su clase
    // this sólo se usa en contructores, getters, setters
    public Persona(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    //El getter lleva el mismo tipo que la variable que retorna:
    public String getNombre(){
        return this.nombre;
    }

    //El setter lleva siempre tipo void
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //Método para visualizar en consola una persona:
    public void mostrarPersona(){
        System.out.printf("\n\t +--------------------+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Telefono: %s" +
                          "\n\t | Edad: %d " +
                          "\n\t +--------------------+",nombre,telefono,edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}

