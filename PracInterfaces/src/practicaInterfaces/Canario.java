/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Canario, hereda de Ave, Padre de Piolin
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Canario extends Ave {
    private String canta;

    public Canario() {
    }

    public Canario(String canta, String sexo, int edad) {
        super(sexo, edad);
        this.canta = canta;
    }

    /**
     * @return the canta
     */
    public String getCanta() {
        return canta;
    }

    /**
     * @param canta the canta to set
     */
    public void setCanta(String canta) {
        this.canta = canta;
    }
    
    
}
