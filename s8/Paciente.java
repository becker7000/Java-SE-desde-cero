public class Paciente extends Usuario {

    private String sintomas;

    public Paciente(String nombre, String apellido, String sintomas) {
        super(nombre, apellido);
        this.sintomas = sintomas;
    }

    @Override
    public void mostrar() {
        System.out.printf("\n\t +------PACIENTE-------+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Sintomas: %s" +
                          "\n\t +---------------------+",nombre,sintomas);
    }
}
