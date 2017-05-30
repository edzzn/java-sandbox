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
public class Line extends Graphic{

    int lineLenght;

    public Line(int lineLenght) {
        this.lineLenght = lineLenght;
    }
    
    
    
    @Override
    public void draw() {
        System.out.println("Drawing Line: " + this.lineLenght);
    }

    
}
