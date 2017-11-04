/*
 * Producutor/Consumidor
 * Fecha: 8 Octubre 2017
 * Descripción: Problema clásico de accesso a recursos compartidos que debe
 * arbitrarse mediante algún mecanismo de concurrencia que implemente la exclusión mutua.
 *
 * mas info: http://soft0.upc.edu/pc/practiques/semafors-monitors/monitors/node1.html
 */
package productosconsumidores;

/**
 *
 * @author edzzn
 * mas info: http://soft0.upc.edu/pc/practiques/semafors-monitors/monitors/node1.html
 * El problema consiste en el acceso concurrente por parte de procesos productores 
 * y procesos consumidores sobre un recurso común.
 * 
 * El acceso de los productores y consumidores debe hacerse en exclusión mútua.  
* 
 * 
 */
public class ProductorConsumidorTest {

    final static int SIZE = 10, NP = 2, NC = 2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer b = new Buffer(new CircularQueue(SIZE));
        
        // Crear Productores
        for (int i=0; i < NP; i++){
            new Producer(b, i).start();
        }
        
        // Crear Consumidores
        for (int i=0; i < NP; i++){
            new Consumer(b, i).start();
        }
    }
    
}
