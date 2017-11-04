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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorHilo extends Thread{
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private int idSession;

    public ServidorHilo(Socket socket, int idSession) {
            this.socket = socket;
            this.idSession = idSession;
        
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconcectar(){
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
        String accion = "";
        
        try {
            accion = dis.readUTF();
            if(accion.equals("hola")){
                System.out.println("El cliente " + idSession + " saluda");
                dos.writeUTF("Adios");
            }else{
                System.out.println("El cliente " + idSession + " Envio un comando invalido");
                dos.writeUTF("Comando desconocido");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconcectar();
    }
    
    
}
