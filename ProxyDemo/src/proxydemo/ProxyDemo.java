/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	08-06-2017
 * MODIFICACION:
 *
 * DESCRIPCION: Proxy Pattern.
 *              Implementación del patron proxy.
 *              Basado en el ejemplo De tutorialsPoint.net
 *              
 * @author Edisson Reinozo 
 */
package proxydemo;

public class ProxyDemo {

   public static void main(String argv[]) {
       Image image = new ProxyImage("image.jpg");
       
       // imagen va a ser cargada desde el disco
       image.display();
       System.out.println("");
       
       // Imagen no va a ser cargada desde el disco
       image.display();
  }

}