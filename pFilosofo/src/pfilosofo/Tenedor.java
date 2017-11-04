/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfilosofo;

/**
 *
 * @author edzzn
 */
public class Tenedor {
    private int id;
    private boolean libre=true;

    public Tenedor(int id) {
        this.id = id;
    }
    
    public synchronized void qTenedor(int i) throws InterruptedException{
        while(!libre){
            wait();
        }
        
        System.out.println("Filosofo " +i+ " coge tenedor " + id);
        libre = false;
    }
           
    public synchronized void sTenedor(int i){
        libre=true;
        System.out.println("Filosofo " +i+ " suelta el tenedor " + id);
        notify();
    }
}
