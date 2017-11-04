/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edzzn
 */
public class Principal extends Thread{
    private int id;

    public Principal(int id) {
        this.id = id;
    }
    
    public void run(){
        System.out.println("Corriendo hilo: " + id);
    }
    
    public static void main(String[] args) {
        Principal h1 = new Principal(1);
        h1.start();
    }
    
    
}
