/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author edzzn
 */
public class Cliente {

    public static void main(String[] args) {     
        try {
            Socket cliente = new Socket("localhost", 4500);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("Hola Servidor");
            
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            String mensajeEntrada = (String) entrada.readObject();
            System.out.println("Mensaje desde el servidor: " + mensajeEntrada);
            cliente.close();
            System.out.println("Conexión Cerrada");
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
}
