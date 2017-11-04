/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multihilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edzzn
 */
public class Cliente {
    public static void main(String[] args) {
        ArrayList<Thread> clients = new ArrayList<Thread>();
        
        for(int i = 0; i < 5; i++){
            clients.add(new Persona(i));
        }
        
        for(Thread thread: clients){
            thread.start();
        }
        
        for(Thread thread: clients){
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Se acabaron de ejecutar todos los Clientes");
    }
}
