/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforoproductorconsumidor;

import java.util.concurrent.Semaphore;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author edzzn
 */
public class Principal {
        static int abejas = 5; // Cantidad de hilos abeja, cantidad 
        static final int MAX_TARRO = 10; // capacidad máxima del tarro
        static int porciones=0; // contabilizador de porciones
        static final int TARROS = 2; //tarros que comeŕa el oso
        static int TARROINICIAL = 0; //Contador de carros que se comera el Oso
        static volatile int counter = 0; // porciones todales que podran las abejas producir
        static public Semaphore noFull = new Semaphore(MAX_TARRO); //Semaforo Bloquea al oso
        static public Semaphore noEmpty = new Semaphore(0); // Semaforo bloquea a las abejas
        static public Semaphore mutex = new Semaphore(1); // Semaforo para bloquear la sección critica
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread[] abeja = new Thread[abejas];
        Thread oso;
        
        // inicializa el hilo oso
        oso = new Thread(new Oso());
        oso.start();
        
        
        for(int i= 0; i < abejas; i++){
            abeja[i] = new Thread(new Abeja(i));
            abeja[i].start();
        }
        
        System.out.println("\n\n Total de prociones puestas por las abejas y comidas por el oso:");
    }
    
}
