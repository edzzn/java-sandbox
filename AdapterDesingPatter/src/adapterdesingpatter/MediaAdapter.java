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

public class MediaAdapter implements IMediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;
    
    public MediaAdapter(String audioType){
        
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if( audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player(); 
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(filename);
        } else if( audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(filename);
        }
    }
}
