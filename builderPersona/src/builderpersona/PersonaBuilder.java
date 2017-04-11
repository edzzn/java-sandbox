/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	00- -201
 * MODIFICACION:
 *
 * DESCRIPCION: Constructor de la clase persona
 *              abstractBuilder
 *
 *
 * This code is under the MIT license.
 */
package builderpersona;

/**
 * 
 * @author Edisson Reinozo <edisson at edzzn.com>
 */

abstract class PersonaBuilder {
    protected Persona persona;
    
    public void createPersona(){
        setPersona(new Persona());
    }
    
    public abstract void buildId();
    public abstract void buildNombre();
    public abstract void buildApellido();
    public abstract void buildEdad();
    public abstract void buildTelefono();
    public abstract void buildDireccion();

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
}
