/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	00- -201
 * MODIFICACION:
 *
 * DESCRIPCION: ContreteBuilder - Clase persona
 *
 *
 * This code is under the MIT license.
 */


package builderpersona;

/**
 * 
 * @author Edisson Reinozo <edisson at edzzn.com>
 */

public class PersonaE extends PersonaBuilder{

    @Override
    public void buildId() {
        persona.setId(5);
    }

    @Override
    public void buildNombre() {
        persona.setNombre("Nombre_P");
    }

    @Override
    public void buildApellido() {
        persona.setApellido("Apellido_P");
    }

    @Override
    public void buildEdad() {
        persona.setEdad(21);
    }

    @Override
    public void buildTelefono() {
        persona.setTelefono("112345687");
    }

    @Override
    public void buildDireccion() {
        persona.setDireccion("Dir Persona");
    }

}
