/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	08-06-2017
 * MODIFICACION:
 *
 * DESCRIPCION: ProxyImagen.
 *              implementada por ProxyImage y RealImage
 *              
 * @author Edisson Reinozo 
 */

package proxydemo;


public class ProxyImage implements Image{
    
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
      
    
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
    
}
