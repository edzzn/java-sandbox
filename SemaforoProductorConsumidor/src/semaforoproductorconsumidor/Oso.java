/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforoproductorconsumidor;

import static java.lang.Thread.sleep;

/**
 *
 * @author edzzn
 */
public class Oso implements Runnable{

    @Override
    public void run() {
        int cont= 0, cont2 = 0;
        
        while(cont2<Principal.TARROS){
            try {
                cont2++;
                while(cont < Principal.MAX_TARRO){ // Hasta que el oso no vacie el tarro
                    Principal.noEmpty.acquire(); // Bloquea al Oso si no empty
                    if(cont==0){
                        System.out.printf("\n\n------------------ Oso Comiendo ------------------");
                    }
                    
                    Principal.porciones--;
                    System.out.printf("\nEl oso se come una porción. Total de porciones restantes: "+ Principal.porciones);                    
                    cont++;
                    
                    if(Principal.porciones == 0){
                        Principal.noFull.release(Principal.MAX_TARRO);                               
                    }
                    
                    sleep(1);
                    
                }
                cont = 0;
            } catch (Exception e) {
            }
        }
    }
    
}
