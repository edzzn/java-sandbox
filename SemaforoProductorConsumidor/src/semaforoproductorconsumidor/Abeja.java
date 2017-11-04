/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforoproductorconsumidor;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edzzn
 */

public class Abeja implements Runnable{
    
    private int id;

    public Abeja(int id) {
        this.id = id;
    }
    
    
    
    @Override
    public void run() {
        while(true){
            try {
                Principal.noFull.acquire(); // Bloquea a las abejas si noFUll vale 0, Si no solamente decrementa
                if((Principal.counter/Principal.MAX_TARRO) < Principal.TARROS){
                    sleep(1);
                    
                    Principal.mutex.acquire(); // empieza la sección critica
                    // ------------- Inicia Sección Critica ------------- 
                    if(Principal.porciones==0){
                        System.out.printf("\n\n------------------ Abejas Produciendo ------------------");
                    }
                    
                    Principal.counter++; // las Abejas ponen una porción de miel en el contador
                    System.out.printf("\nSe ha puesto en el tarro 1 porción (Abeja " + this.id + "), total de porciones: " +Principal.porciones);                    
                    
                    // ------------- Fin Sección Critica ------------- 
                    Principal.mutex.release();
                    
                    Principal.porciones++; // aunmenta las porciones que ponen las abejas en el tarro
                    
                    if(Principal.porciones == Principal.MAX_TARRO){
                        Principal.TARROINICIAL++;
                        Principal.noEmpty.release(Principal.MAX_TARRO); // Incremente el valor del semáforo
                    }
                }else {
                    Principal.noFull.release();
                    break;
                }
                   
                                    
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Abeja.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
    

}
