/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Ave, clase padre de Canario, Loro y Buitre
 *
 *
 * @param args
 * @author edzzn
 */

package practicaInterfaces;

public class Ave {
    private String sexo;
    private int edad;

    public Ave() {
    }

    public Ave(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
