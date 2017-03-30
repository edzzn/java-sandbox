/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PG402;
public abstract class JugadorCampo extends Jugador{
   protected int cantPases;
   protected int cantRecuperaciones;

    public JugadorCampo() {
    }

    
    public JugadorCampo(String nombre, int numero, int rut) {
        super(nombre, numero, rut);
        this.cantPases = 0;
        this.cantRecuperaciones = 0;
    }

    public void darPase(){
        this.cantPases++;
    }
    
    public void recuperarBalon(){
        this.cantRecuperaciones++;
        
    }
    
    
    
    /**
     * @return the cantPases
     */
    public int getCantPases() {
        return cantPases;
    }

    /**
     * @param cantPases the cantPases to set
     */
    private void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }

    /**
     * @return the cantRecuperaciones
     */
    public int getCantRecuperaciones() {
        return cantRecuperaciones;
    }

    /**
     * @param cantRecuperaciones the cantRecuperaciones to set
     */
    private void setCantRecuperaciones(int cantRecuperaciones) {
        this.cantRecuperaciones = cantRecuperaciones;
    }

    
   
   
}
