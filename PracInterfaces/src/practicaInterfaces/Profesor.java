/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Profesor, hereda de persona.
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Profesor extends Persona {

    private String despacho;
    private String email;

    public Profesor() {
    }

    public Profesor(String despacho, String email, String nombre, int edad) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Profesor y sé hablar");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Despacho: " + this.getDespacho());
    }

    /**
     * @return the despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
