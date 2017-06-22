/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author edzzn
 */
public class ProxyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Image image = new ProxyImage("File_directory.jpg");
        
        // loads image from disk
        image.display();
        System.out.println("");
        
        
        // does not load. Image already created
        image.display();
                

    }
    
}
