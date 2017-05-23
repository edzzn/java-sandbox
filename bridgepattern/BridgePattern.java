/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 23 Mayo 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Ejemplo de implementación de el patron de diseño
 *              BridgePatter, Fuente:
 *              https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
 * 
 *              Utilizando Shape y DrawAPI podemos dibujos circulos
 *              con disitntos colores
 *
 *
 *
 */
package bridgepattern;

public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape redCircle = new Circle(100,100, 10, new RedCircle());
       Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

       redCircle.draw();
       greenCircle.draw();
    }
    
}
