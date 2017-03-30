/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PG402;

public class Defensor extends JugadorCampo {

    public Defensor() {
    }
   
    public Defensor(String nombre, int numero, int rut){
        super(nombre, numero, rut);
    }
    
    @Override
    public int calcularValoracion(){
        return super.calcularValoracion() + this.cantPases + this.cantRecuperaciones * 4;
    }
    
    
}
