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

public class ClienteUDP {

    public static void main(String[] args) {
        DatagramSocket sDatagram = null;
        try {
            // Creamos el socket no orientado a conexión
            // (numero del puerto)

            sDatagram = new DatagramSocket();
            // Establecemos un timeout de 30 segs
            sDatagram.setSoTimeout(30000);
            // Obtenemos la dirección IP del servidor
            // (recibida en el primer argumento por linea de comandos)
            InetAddress dirServidor = InetAddress.getByName("localhost");

            String mensaje = "MENSAJE ECO";
            // Preparamos el datagrama que vamos a enviar y lo enviamos
            DatagramPacket dgramEnv = new DatagramPacket(mensaje.getBytes(),
                    mensaje.getBytes().length, dirServidor, 5000);
            // Enviamos el datagrama
            sDatagram.send(dgramEnv);
            System.out.println("CLIENTE: Enviando "
                    + new String(dgramEnv.getData()) + " a "
                    + dgramEnv.getAddress().toString() + ":"
                    + dgramEnv.getPort());
            // Preparamos el datagrama de recepción
            byte array[] = new byte[1024];
            array[1023] = 52;
            DatagramPacket dgramRec = new DatagramPacket(array, array.length);
            // Recibimos el mensaje
            sDatagram.receive(dgramRec);
            System.out.println("CLIENTE: Recibido "
                    + new String(dgramRec.getData(), 0, dgramRec.getLength())
                    + " de " + dgramRec.getAddress().toString() + ":"
                    + dgramRec.getPort());

        } catch (SocketTimeoutException e) {
            System.out.println("30 segundos sin recibir nada");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            //cerramos el socket para liberar la conexion
            sDatagram.close();
        }
    }
}
