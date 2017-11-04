/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multihilos;

/**
 *
 * @author edzzn
 */
import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket ss;
        System.out.println("Inicializando el Servidor...");
        
        try {
            ss = new ServerSocket(10578);
            System.out.println("\t[OK]");
            int idSession = 0;
            
            while(true){
                Socket socket;
                socket = ss.accept();
                
                System.out.println("Nueva conexión estante: " + socket);
                Thread hilo = new ServidorHilo(socket, idSession);
                hilo.start();
                idSession++;
            }
        } catch (Exception e) {
        }
    }
    
    
}
