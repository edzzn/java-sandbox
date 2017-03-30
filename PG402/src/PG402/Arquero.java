/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PG402;

/**
 *
 * @author Estudiante
 */
public class Arquero extends Jugador {

    private int cantTapadas;

    public Arquero() {
    }

    public Arquero(String nombre, int numero, int rut) {
        super(nombre, numero, rut);
        this.cantTapadas = 0;
    }

    public void tapar() {
        cantTapadas++;
    }

    @Override
    public int calcularValoracion() {
        return super.calcularValoracion() + this.getcantTapadas() * 5;
    }

    /**
     * @return the tapadas
     */
    public int getcantTapadas() {
        return cantTapadas;
    }

    /**
     * @param cantTapadas the tapadas to set
     */
    public void setcantTapadas(int cantTapadas) {
        this.cantTapadas = cantTapadas;
    }

}
