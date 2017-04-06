/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Producto, Representa el objeto complejo de la construccion
 *              Para este objeteo se requieren multiples representaciones
 *              
 * 		
 * @param args
 * @author edzzn
 */
package builderpizza;

public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = ""; 

        
    /**
     * @return the masa
     */
    public String getMasa() {
        return masa;
    }

    /**
     * @param masa the masa to set
     */
    public void setMasa(String masa) {
        this.masa = masa;
    }

    /**
     * @return the salsa
     */
    public String getSalsa() {
        return salsa;
    }

    /**
     * @param salsa the salsa to set
     */
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    /**
     * @return the relleno
     */
    public String getRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    
    
    
}
