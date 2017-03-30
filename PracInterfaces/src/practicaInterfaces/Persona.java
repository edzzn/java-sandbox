/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase persona, 
 *              Esta clase tendra 3 subclases distintas.
 * 
 * 		
 * @param args
 * @author edzzn
 */

package practicaInterfaces;

abstract class Persona implements Hablador{
    private String nombre;
    private int edad;

    // Constructor de la clase personam, sin parametros
    public Persona() {
    }

    
    // Constructor de la clase personam, sin parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
