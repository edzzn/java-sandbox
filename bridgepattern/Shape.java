/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 23 Mayo 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Create an abstract class Shape using the DrawAPI interface.
 *
 *
 *
 */
package bridgepattern;

public abstract class Shape {
   protected DrawAPI drawAPI;
   
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}