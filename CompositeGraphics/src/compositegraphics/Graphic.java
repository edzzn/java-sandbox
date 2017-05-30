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
public abstract class Graphic {

    public abstract void draw();

    public void add(Graphic grafico) {
        System.out.println("");   
    }

    public void remove(Graphic grafico) {
        System.out.println("");   
    }

    public Graphic getChild(int index) {
        System.out.println("");   
        return null;
    }

}
