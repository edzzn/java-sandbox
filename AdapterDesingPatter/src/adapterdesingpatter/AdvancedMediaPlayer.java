/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	04-05-201
 * MODIFICACION:
 *
 * DESCRIPCION: Interfaz AdvancedMediaPlayer
 *              Ejemplo de la implementacion del patron de Diseño
 *              Creacional: Adapter
 *
 *
 * @author Edisson Reinozo 
 */
package adapterdesingpatter;

public interface AdvancedMediaPlayer {
    public void playVlc(String filename);
    public void playMp4(String filename);
}
