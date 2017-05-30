/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author edzzn
 */
public class DiscJockey {
    SongComponent songList;
    
    public DiscJockey(SongComponent newSongList){
        songList = newSongList;   
    }
    
    public void getSongList(){
        songList.displaySongInfo();
    }
}
