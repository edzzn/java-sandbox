/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsrepaso;

import java.net.Socket;
import java.io.*;

/**
 *
 * @author edzzn
 */
public class Cliente {
    Socket cliente;
    int puerto = 9000;
    String ip = "127.0.0.1";
    BufferedReader entrada, teclado;
    PrintStream salida;
    
    public void inicio(){
        try {
            cliente = new Socket(ip, puerto);
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        
            teclado = new BufferedReader(new InputStreamReader(System.in));
            String tec = teclado.readLine();
            
            salida = new PrintStream(cliente.getOutputStream());
            salida.print(tec);
            
            String mag = entrada.readLine();
            System.out.println(mag);
            
            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
        
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.inicio();
               
    }
}
