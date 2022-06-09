public class Doctor extends Usuario {

    private String especialidad;

    public Doctor(String nombre, String apellido, String especialidad) {
        super(nombre, apellido); //super hace referencia al constructor de la clase Usuario (clase padre)
        this.especialidad = especialidad; //this hace referencia a los atributos internos de la clase Doctor (clase hija)
    } //La multiherencia (una clase hija tiene más de un padre) está prohibida en Java

    //Los métodos abstractos declarados en una clase padre
    //estamos obligados a definirlos en las clases hijas.
    @Override
    public void mostrar() {
        System.out.printf("\n\t +------DOCTOR-------+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Especialidad: %s" +
                          "\n\t +-------------------+",nombre,especialidad);
    }
}
