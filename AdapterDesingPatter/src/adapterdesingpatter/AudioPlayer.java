/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	04-05-201
 * MODIFICACION:
 *
 * DESCRIPCION: Interfaz MediaPlayer
 *              Ejemplo de la implementacion del patron de Diseño
 *              Creacional: Adapter
 *
 *
 * @author Edisson Reinozo
 */
package adapterdesingpatter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        // in built support to play mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);

        } else {
            System.out.println("Invalid media " + audioType + "format not supported");
        }

    }
}