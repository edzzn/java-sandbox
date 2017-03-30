/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PG402;

public abstract class Jugador {

    protected String nombre;
    protected int numero;
    protected int rut;
    protected int cantGoles;

    public Jugador() {
    }

    public Jugador(String nombre, int numero, int rut) {
        this.nombre = nombre;
        this.numero = numero;
        this.rut = rut;
        this.cantGoles = 0;
    }

    public void anotarGol() {
        this.cantGoles++;
    }
    
    public int calcularValoracion(){
        return this.cantGoles*30;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    private void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

}
