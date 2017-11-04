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
public class Producer extends Thread{
    protected Buffer b;
    private int id;
    
    public Producer(Buffer b, int id){
        this.b = b;
        this.id = id;
    }
    
    public void run(){
        int n = 0;
        
        while(true){
            Object value = produce(n);
            System.out.println("Producer #" + id + ": [ put " + n++ + " ...");
            b.put(value);
            System.out.println("Producer #" + id + ": ]");
        }
    }
    
    private Object produce(int n){
        try {
            sleep((int) (Math.random() * 100));
        } catch (InterruptedException e){
            
        }
        
        return new Integer(n);
    }
    
}
