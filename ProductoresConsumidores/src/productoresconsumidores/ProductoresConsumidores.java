/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoresconsumidores;

import com.sun.corba.se.impl.activation.ProcessMonitorThread;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author edzzn
 */
public class ProductoresConsumidores implements Runnable{

    /**
     * @param args the command line arguments
     */
    private static Object lock = new Object();
    private boolean consumidor;
    private static int numTartas = 0;

    public ProductoresConsumidores(boolean consumidor) {
        this.consumidor = consumidor;
    }
    
    public static void main(String[] args) {
        int numHilos = 11;
        Thread[] hilos = new Thread[numHilos];
        // TODO code application logic here
        
        for(int i = 0; i < hilos.length; i++){
            Runnable runnable;
            if(i != 0){
                runnable = new ProductoresConsumidores(true);
            } else{
                runnable = new ProductoresConsumidores(false);
            }
            hilos[i] = new Thread(runnable);
            System.out.println("Iniciando Hilo " + i);
            hilos[i].start();
        }
        
        for(int i = 0; i < hilos.length; i++){
            try {
                hilos[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresConsumidores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        while(true){
            if(consumidor){
                consumiendo();
            } else {
                produciendo();
            }
        }
        
    }

    private void produciendo() {
        synchronized(lock){
            if(this.numTartas == 0){
                numTartas = 10;
                System.out.println("Se acaban de producir 10 tartas");
                lock.notifyAll();
            }
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresConsumidores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void consumiendo() {
        synchronized(lock){
            if(this.numTartas > 0){
                try {
                    numTartas--;
                    System.out.println("Acabo de comer una tarta, queda " + numTartas);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProductoresConsumidores.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else{
                lock.notifyAll();
                try {
                    lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProductoresConsumidores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
