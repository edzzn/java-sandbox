/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Padre aparato
 *
 *
 * @param args
 * @author edzzn
 */

package practicaInterfaces;

public class Aparato {
    private int consumo;
    private int precio;

    public Aparato() {
    }

    public Aparato(int consumo, int precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
