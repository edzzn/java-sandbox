/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositegraphics;

/**
 *
 * @author Estudiante
 */
public class Rectangle extends Graphic{
    int base;
    int altura;

    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: [" + this.base + ", " + this.altura + "]");
    }
    
    
    
}
