/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsrepaso;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author edzzn
 */
public class ConectorTCP {
    ServerSocket server;
    Socket socket;
    int puerto = 9000;
    DataOutputStream salida;
    BufferedReader entrada;
    
    public void iniciar(){
        try {
            // instanciamos el servidor
            server = new ServerSocket(puerto);
            socket = new Socket();
            
            // Acepta las solicitudes que lleguen al puerto
            socket = server.accept();
            
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            // leemos el mensaje
            String mensaje = entrada.readLine();
            
            System.out.println(mensaje);
            
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF("Adios Mundo");
            
            // Cerramos la conexión
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ConectorTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
