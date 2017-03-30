/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Bedel, hereda de persona.
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Bedel extends Persona {

    private String turno;
    private int antiguedad;

    public Bedel() {
    }

    public Bedel(String turno, int antiguedad, String nombre, int edad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Bedel y sé hablar");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("Antiguedad: " + this.getAntiguedad());
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
