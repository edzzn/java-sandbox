/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	04-05-201
 * MODIFICACION:
 *
 * DESCRIPCION: Clase Concreta VlcPlayer, Implementa AdvancedMediaPlayer
 *              Ejemplo de la implementacion del patron de Diseño
 *              Creacional: Adapter
 *
 *
 * @author Edisson Reinozo 
 */
package adapterdesingpatter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file: " + filename);
    }

    @Override
    public void playMp4(String filename) {
        // does nothing
    }
    
}
