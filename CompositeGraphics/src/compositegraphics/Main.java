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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graphic linea = new Line(5);
//        grafico1.draw();
        
        Graphic rectangulo = new Rectangle(5, 10);
//        grafico2.draw();
        
        Graphic texto = new Text("Este es un texto.");
//        grafico3.draw();

        
        Picture foto = new Picture();
        
        foto.add(texto);
        foto.add(linea);
        foto.add(rectangulo);
        foto.draw();
        
        System.out.println("************************");
        Picture fotoCompuesta = new Picture();
        
        fotoCompuesta.add(texto);
        fotoCompuesta.add(foto);
        fotoCompuesta.add(rectangulo);
        fotoCompuesta.draw();
        
        
        
    }
    
}
