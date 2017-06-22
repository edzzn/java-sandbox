/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	04-05-201
 * MODIFICACION:
 *
 * DESCRIPCION: Ejemplo de la implementacion del patron de Diseño
 *              Creacional: Adapter
 *
 *
 * @author Edisson Reinozo
 */
package adapterdesingpatter;

public class AdapterDesingPatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "file.mp3");
        audioPlayer.play("mp4", "file.mp4");
        audioPlayer.play("vlc", "file.vlc");
        audioPlayer.play("mp5", "file.vlc");

    }

}
