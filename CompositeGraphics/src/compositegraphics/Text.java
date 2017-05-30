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
public class Text extends Graphic{
    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("Texto: \"" + this.text + "\"");
    }
    
    
    
}
