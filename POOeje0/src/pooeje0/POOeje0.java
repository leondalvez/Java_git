/*
 *Práctica de Java en POO
 */
package pooeje0;

import entidad.Persona;

/**
 *
 * @author usuario
 */
public class POOeje0 {

    
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
        
        // Imprimimos lo mismo pero utilizando los getters 
        System.out.println("Hola " + TerceraPersona.getNombre() + " " + TerceraPersona.getApellido() + ". Tú DNI es: " + TerceraPersona.getDni());
        
        //Utilizo un getter para modificar el atributo nombre de tercera persona
        TerceraPersona.setNombre("Albertasa");
        
        // Imprimo para mostrar el cambio
        System.out.println("Hola " + TerceraPersona.getNombre() + " " + TerceraPersona.getApellido() + ". Tú DNI es: " + TerceraPersona.getDni());
        
    }

}
