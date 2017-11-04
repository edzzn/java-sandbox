/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
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
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4500);
            Socket clienteNuevo = servidor.accept();
            ObjectInputStream entrada = new ObjectInputStream(clienteNuevo.getInputStream());
            
            System.out.println("Objeto Llegó");
            
            String mensaje = (String) entrada.readObject();
            System.out.println("Mensaje: " + mensaje);
            
    
            System.out.println("");
            System.out.println("Mandando otro mensaje al cliente");
            ObjectOutputStream resp = new ObjectOutputStream(clienteNuevo.getOutputStream());
            resp.writeObject("Hola Cliente");
            System.out.println("Mensaje Enviado");
            
            // Cerramos las conecciones
            clienteNuevo.close();
            servidor.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
