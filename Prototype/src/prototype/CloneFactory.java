/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author edzzn
 */
public class CloneFactory {
    // recibe un animal o cualquier subclase de animal
    // y crea una copy.
    
    public Animal getClone(Animal anyAnimal){
        
        return anyAnimal.makeCopy();
    }
    
}
