public abstract class Usuario {

    protected String nombre;
    protected String apellido;

    protected Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Método abstracto: no llevan bloque de código cuando se declaran
    public abstract void mostrar();

}

/*
* Las clase abstractas no se deben instanciar
* sólo sirven para hacer herencia.
* */
