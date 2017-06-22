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
// Concrete Decorator
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        this.setBlueBoder(decoratedShape);
    }

    public void setBlueBoder(Shape decoratedShape) {
        System.out.println("Border Color: Blue");

    }
}
