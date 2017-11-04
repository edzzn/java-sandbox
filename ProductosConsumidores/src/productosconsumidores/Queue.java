/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosconsumidores;

/**
 *
 * @author edzzn
 */
public abstract class Queue {
    // Numero de elementos
    public abstract int rank();
    
    // Numero le lugares libres disponibles
    public abstract int free();
    
    // Esta vacio ?
    public boolean isEmpty(){
        return rank() == 0;
    }
    
    // Esta lleno ?
    public abstract boolean isFull();
    
    // Obtener valor del elemento tope de la lista de espera
    public abstract Object get();
    
    // Poner valor al final de la lista de espera
    public abstract void put(Object value);
    
}
