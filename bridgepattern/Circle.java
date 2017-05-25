/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 23 Mayo 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Clase concreta Circle implementa la interfaz Shape
 *
 *
 *
 */
package bridgepattern;


public class Circle extends Shape {
   private int x, y, radius;

   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}