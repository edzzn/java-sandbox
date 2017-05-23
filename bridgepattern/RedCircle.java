/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 23 Mayo 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Implementador concreto de DrawAPI
 *
 *
 *
 */
package bridgepattern;


public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}