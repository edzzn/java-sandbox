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
public class Silla {
    private int slibre=4;
    
    public synchronized void qSilla(int i) throws InterruptedException{
        while(slibre==0){
            wait();
        }
        System.out.println("Filosofo " +i+ " coge la silla");
        
        slibre--;
    } 
        
    public synchronized void sSilla(int i) throws InterruptedException{
        System.out.println("Filosofo " +i+ " soltó la silla");
        slibre++;
        notify();
    } 
    
    
}
