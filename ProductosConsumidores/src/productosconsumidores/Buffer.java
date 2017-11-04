/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosconsumidores;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

/**
 *
 * @author edzzn
 */
public class Buffer {
    protected Queue q;
    
    public Buffer(Queue q){
        this.q = q;
    }
    
    public synchronized Object get(){
        while (q.isEmpty()){
            try{
                wait();
            }
            catch (InterruptedException e){
            }
        }
        Object result = q.get();
        notifyAll();
        return result;
    }
    
    public synchronized void put(Object value){
        while (q.isFull()){
            try{
                wait();
            } catch (InterruptedException e){}
        }
        
        q.put(value);
        notifyAll();
    }
}
