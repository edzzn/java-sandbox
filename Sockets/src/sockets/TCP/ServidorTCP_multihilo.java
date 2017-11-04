/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets.TCP;

/**
 *
 * @author ariel
 */
import java.net.*;

public class ServidorTCP_multihilo {

    public static void main(String argv[]) {
       
        try {
            ServerSocket servidor=new ServerSocket(5000);
            servidor.setSoTimeout(100000);
            Socket nuevoCliente;
            ThreadServidor hiloServidor;
            while (true) {
                // Esperamos posibles conexiones
                System.out.println("Esperando conexiones");
                nuevoCliente=servidor.accept();
                System.out.println("Un cliente se ha conectado.");
                // Creamos un objeto ThreadServidor, pasándole la nueva conexión
                hiloServidor=new ThreadServidor(nuevoCliente);
                // Iniciamos su ejecución con el método start()
                hiloServidor.start();
            }
        } catch (SocketTimeoutException e) {
            System.err.println("30 segs sin recibir nada");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
//Cerramos el socket del servidor
        }
    }
}
