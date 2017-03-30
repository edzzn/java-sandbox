/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Buitre, hereda de Ave
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;


public class Buitre extends Ave{
    private int velocidadVuelo;
    private int peso;

    public Buitre() {
    }

    public Buitre(int velocidadVuelo, int peso, String sexo, int edad) {
        super(sexo, edad);
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
    }

    /**
     * @return the velocidadVuelo
     */
    public int getVelocidadVuelo() {
        return velocidadVuelo;
    }

    /**
     * @param velocidadVuelo the velocidadVuelo to set
     */
    public void setVelocidadVuelo(int velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
