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
import java.util.*;

public class Picture extends Graphic {

    ArrayList graphics = new ArrayList();
    
    @Override // Dibuja todos los hijos
    public void draw() {
        Iterator iterador = graphics.iterator();
        while(iterador.hasNext()){
            Graphic grafico = (Graphic) iterador.next();
            grafico.draw();
        }
    }
    
    public void add(Graphic g){
        graphics.add(g);
    }
    
    public void remove(Graphic g){
        graphics.remove(g);
    }
    
    public Graphic getChild(int indexChild){
        return (Graphic) graphics.get(indexChild);
    }
    
    
}
