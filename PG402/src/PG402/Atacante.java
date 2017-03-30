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
public class Atacante extends JugadorCampo{

    public Atacante() {
    }

    public Atacante(String nombre, int numero, int rut) {
        super(nombre, numero, rut);
    }

    @Override
    public int calcularValoracion() {
        return super.calcularValoracion() + this.cantPases * 2 + this.cantRecuperaciones * 3;
    }

  
}
