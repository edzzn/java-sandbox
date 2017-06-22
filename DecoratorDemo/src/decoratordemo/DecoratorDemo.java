/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordemo;

/**
 *
 * @author edzzn
 */
public class DecoratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape cirlce = new Circle();
        
        Shape redCircle = new RedShapeDecorator(cirlce);
        
        redCircle.draw();
        

    }
    
}
