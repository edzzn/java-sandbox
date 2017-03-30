/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Piolin, hereda de Canario
 *              implementa la interfas hablador
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Piolin extends Canario implements Hablador {

    private int numPeliculas;

    public Piolin() {
    }

    public Piolin(int numPeliculas, String canta, String sexo, int edad) {
        super(canta, sexo, edad);
        this.numPeliculas = numPeliculas;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Piolin y sé hablar");
        System.out.println("Edad: "+ super.getEdad());
        System.out.println("Sexo: "+ super.getSexo());
        System.out.println("Canta: "+ super.getCanta());
        System.out.println("Num. Pelucas: "+ this.getNumPeliculas());
    }

    /**
     * @return the numPeliculas
     */
    public int getNumPeliculas() {
        return numPeliculas;
    }

    /**
     * @param numPeliculas the numPeliculas to set
     */
    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }

}
