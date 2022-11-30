/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * Declaro la clase Persona con el modificador de acceso público,
 * así se puede acceder a los elementos de ésta clase desde cualquier clase.
 */
public class Persona {

    /**
     *
     * Declaro sus atributos
     */
    public String nombre;
    public String apellido;
    public int dni;

    /**
     *
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

}
