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

//Abstract Decorator
public abstract  class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape shapeDecorator) {
        this.decoratedShape = shapeDecorator;
    }
    
        
    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
    
    
   
}
