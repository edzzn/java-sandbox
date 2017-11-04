/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudp;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edzzn
 */
public class ClienteTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Formato: Cliente <maquina> <puerto> <mensaje>");
            System.out.println("Length " + args.length);
            for(int i = 0; i<args.length; i++){
                
                System.out.println(args[i]);
            }
            System.exit(-1);
        }
        
        Socket socket = null;
        
        try{
            // Obtenemos la dirección IP del servidor
            InetAddress dirServidor = InetAddress.getByName(args[0]);
            // Obtenemos el puerto del servidor
            int puertoServidor = Integer.parseInt(args[1]);
            // Obtenemos el mensaje
            String mensaje = args[2];
            
            // Creamos el socket y establecemos la conexión con el servidor
            socket = new Socket(dirServidor, puertoServidor);
            
            // Establecemos un timeout de 30 segundo
            socket.setSoTimeout(30000);
            
            System.out.println("CLIENTE: Conexión establecida con " + dirServidor.toString() + " al puerto " + puertoServidor);
            
            // Establecemos el canal de entrada
            BufferedReader sEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            // Establecemos el canal de salida
            PrintWriter sSalida = new PrintWriter(socket.getOutputStream(), true);
            
            System.out.println("CLIENTE: Enviando " + mensaje);
            // Enviamos el emensaje al servidor
            sSalida.println(mensaje);
            
            // Recibimos la respuesta del Servidor
            String recibido = sEntrada.readLine();
            
            System.out.println("CLIENTE: Recibido " + mensaje);
            // Cerramos los flujos y el socket para liberar la conexión
            sSalida.close();
            sEntrada.close();
        
        } catch (SocketTimeoutException e){
            System.err.println("30 segs sin recibir nada");
        } catch (NumberFormatException | IOException e) {
            System.err.println("Error: " + e);
        } finally{
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } 
        }
        
    }
    
}
