/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets.UDP;

/**
 *
 * @author ariel
 */
import java.net.*;

public class ServidorUDP {

    public static void main(String[] args) {
        try {
            DatagramSocket sDatagram = new DatagramSocket(5000);
            byte[] bufer = new byte[1000];
            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion= new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                sDatagram.receive(peticion);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde el puerto remoto: "
                        + peticion.getPort());

                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta
                        = new DatagramPacket(peticion.getData(), peticion.getLength(),
                                peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                sDatagram.send(respuesta);    
                
                
                
            }
        } catch (SocketTimeoutException e) {
            System.err.println("30 segs sin recibir nada");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
// Cerramos el socket
        }

    }
}
