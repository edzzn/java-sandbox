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
public class CircularQueue extends Queue {
    
    private Object[] slots;
    private int first, last, num;
    private final int SIZE;
    
    public CircularQueue(int s){
        slots = new Object[s];
        SIZE = s;
        first = last = num = 0;
    }

    @Override // Numero de elementos
    public int rank() {
        return num;
    }

    @Override // Numero le lugares libres disponibles
    public int free() {
        return SIZE - num;
    }

    @Override // Esta lleno
    public boolean isFull() {
        return num == SIZE;
    }

    @Override // Obtener valor del tope de la pila de espera
    public Object get() {
        Object result = slots[first];
        first = (first + 1) % SIZE;
        num--;
        return result;
    }

    @Override // Poner valor al final de la lista de espera
    public void put(Object value) {
        slots[last] = value;
        last = (last + 1) % SIZE;
        num++;
    }
    
}
