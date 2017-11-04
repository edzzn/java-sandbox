/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfilosofo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edzzn
 */
public class Filosofo extends Thread{
    private int id;
    private Tenedor izq, dcha;
    private Silla s;

    public Filosofo(int id, Tenedor izq, Tenedor dcha, Silla s) {
        this.id = id;
        this.izq = izq;
        this.dcha = dcha;
        this.s = s;
               
    }
    
    @Override
    public void run(){
        while(true){
            try {
                s.qSilla(id);
                
                izq.qTenedor(id);
                dcha.qTenedor(id);
                
                // comer
                dcha.sTenedor(id);
                izq.sTenedor(id);
                s.sSilla(id);
                        
            } catch (InterruptedException ex) {
                Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                    
        }
    }
    
    
    
    
}
