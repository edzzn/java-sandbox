/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgemethod;

/**
 *
 * @author edzzn
 */
public class BridgeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 10, 5, new RedCircle());
        Shape greenCircle = new Circle(10, 10, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }

}
