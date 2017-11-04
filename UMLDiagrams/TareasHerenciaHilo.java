/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author edzzn
 */
public class TareasHerenciaHilo extends Thread{
   
    private String name;
    private int num;

    public TareasHerenciaHilo(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void run(){
        // Tarea que se debe realizar
        for(int i=0; i < 10; i++){
            System.out.println("Hilo " + this.name + " Tarea : " + i);
        }
    }
    
    public static void main(String args[]){
        (new TareasHerenciaHilo("Par", 8)).start();
        
    }
    
}
