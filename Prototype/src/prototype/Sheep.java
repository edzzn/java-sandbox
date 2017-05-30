/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clonador ?
 *
 * 
 */
public class Sheep implements Animal{
    
    public Sheep(){
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Making a copy");
        
        Sheep sheepObject = null;
        
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sheepObject;
    }
    
    public String toString(){
        return "Dolly says Baaa";
    }
    
}
