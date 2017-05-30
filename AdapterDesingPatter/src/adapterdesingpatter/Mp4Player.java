/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	04-05-201
 * MODIFICACION:
 *
 * DESCRIPCION: Clase Concreta Mp4Player, Implementa AdvancedMediaPlayer
 *              Ejemplo de la implementacion del patron de Diseño
 *              Creacional: Adapter
 *
 *
 * @author Edisson Reinozo
 */
package adapterdesingpatter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        // does nothing
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file: " + filename);
    }

}
