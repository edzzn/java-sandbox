/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	00- -201
 * MODIFICACION:
 *
 * DESCRIPCION: Construye el objeto utilizando la inferfaz Builder
 *
 *
 * This code is under the MIT license.
 */

package builderpersona;

/**
 * 
 * @author Edisson Reinozo <edisson at edzzn.com>
 */

public class Aplicacion {
    private PersonaBuilder personaBuilder;
    
    public void construirPersona(){
        personaBuilder.createPersona();
        personaBuilder.buildId();
        personaBuilder.buildNombre();
        personaBuilder.buildApellido();
        personaBuilder.buildEdad();
        personaBuilder.buildTelefono();
        personaBuilder.buildDireccion();
    }
    
    public Persona getPersona(){
        return personaBuilder.getPersona();
    }

    /**
     * @param personaBuilder the personaBuilder to set
     */
    public void setPersonaBuilder(PersonaBuilder personaBuilder) {
        this.personaBuilder = personaBuilder;
    }

}
