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
import java.io.*;

public class ServidorTCP {

    public static void main(String argv[]) {
        try {
            // Creamos el socket del servidor
            ServerSocket server_socket=new ServerSocket(5000);
            // Establecemos un timeout de 30 segs
            server_socket.setSoTimeout(30000);
            Socket socket;
            BufferedReader entrada;
            DataOutputStream salida;
            String mensajeRecibido;
            while (true) {
                // Esperamos posibles conexiones
                System.out.println("Esperando conexiones");
                socket=server_socket.accept();
                System.out.println("Un cliente se ha conectado.");

                // Establecemos el canal de entrada
                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // Establecemos el canal de salida
                salida = new DataOutputStream(socket.getOutputStream());
                // Recibimos el mensaje del cliente
                System.out.println("Confirmando conexion al cliente....");
                System.out.println("Conexion exitosa");
                mensajeRecibido = entrada.readLine();
                System.out.println(mensajeRecibido);    
                // Enviamos el eco al cliente
                salida.writeUTF(mensajeRecibido);
                salida.writeUTF("  Gracias por conectarte, adios! ");
                // Cerramos los flujos
                System.out.println(" Cerrando conexión...");
                socket.close();//Aqui se cierra la conexión con el cliente
            }
        } catch (SocketTimeoutException e) {
            System.err.println("30 segs sin recibir nada");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
//Cerramos el socket
        }

    }

}
