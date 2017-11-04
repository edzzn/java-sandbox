/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudp.server;

/**
 *
 * @author edzzn
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

public class ServidorTCP {
    
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Formato: ServidorTCP <puerto>");
            System.exit(-1);
        }
        
        int puerto = Integer.parseInt(args[0]);
        
        try {
            // Creamos el socket del servidor
            ServerSocket serverSocket = new ServerSocket(puerto);
            
            // Establecemos el timeout de 30 segs
            serverSocket.setSoTimeout(30000);
            
            while(true){
                // Esperamos posibles conexiones
                Socket socket = serverSocket.accept();
                
                // Establecemos el canal de entrada
                BufferedReader sEntrada = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                
                // Establecemos el canal de salida
                DataOutputStream sSalida = new DataOutputStream(socket.getOutputStream());                
                
                // Recibimos el mensaje del cliente
                String mensaje = sEntrada.readLine();
                
                // Enviamos el eco al cliente
                sSalida.writeBytes(mensaje);
                
                // Cerramos los flujos
                sSalida.close();
                sEntrada.close();
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    
}
