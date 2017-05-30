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
public abstract class Shape {
    protected IDrawAPI drawAPI;
    
    protected Shape(IDrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    
    public abstract void draw();
}
