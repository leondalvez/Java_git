/*
 *Práctica de creación y usos de las clases
 */
package entidad;

/**
 *
 * Declaro la clase Persona con el modificador de acceso público, así se puede
 * acceder a los elementos de ésta clase desde cualquier clase.
 */
public class Persona {



    /**
     *
     * Declaro sus atributos con sus modificadores
     * modificador - tipo de dato -  nombre de variable
     */
    public String nombre;
    public String apellido;
    public int dni;

    /**
     * Armo un constructor vacio
     */
    public Persona() {

    }

    // Armo un constructor con un parametro 
    public Persona(String nombre) {

        this.nombre = nombre;

    }

    // Declaro un tercer constructor con los 3 parametros.
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
     
    //Declaro los getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
    
    //Declaro los setters
    
        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
