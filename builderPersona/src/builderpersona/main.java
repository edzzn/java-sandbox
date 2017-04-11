/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	10-04-2017
 * MODIFICACION:
 *
 * DESCRIPCION: Implementacion del patron Builder
 *
 *
 *
 *
 * This code is under the MIT license.
 */
package builderpersona;

/**
 *
 * @author Edisson Reinozo <edisson at edzzn.com>
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        PersonaBuilder persona_e = new PersonaE();
        //PersaonaBuilder margarita_constructorpizza = new ConstructorPizzaMargarita();

        aplicacion.setPersonaBuilder(persona_e);
        aplicacion.construirPersona();

        Persona persona = aplicacion.getPersona();

        System.out.println(persona.getId());
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getDireccion());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getEdad());
        
        
    }

}
