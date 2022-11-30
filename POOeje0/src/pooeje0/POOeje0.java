/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje0;

import entidad.Persona;

/**
 *
 * @author usuario
 */
public class POOeje0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciación utilizando el constructor vacio.
        Persona PrimeraPersona = new Persona();
        // Instanciamos la segunda persona con el constructor con un parametro.
        Persona SegundaPersona = new Persona("Luciano");
        // Instanciamos una tercera persona con tres parametros por constructor.
        Persona TerceraPersona = new Persona("Alberta", "Da", 30300300);
        
        // Imprimimos utilizando el nombre del objeto TerceraPersona
        // pero accediendo a sus atributos TerceraPersona.atributo
        System.out.println("Hola " + TerceraPersona.nombre + " " + TerceraPersona.apellido + ". Tú DNI es: " + TerceraPersona.dni);
    }

}
