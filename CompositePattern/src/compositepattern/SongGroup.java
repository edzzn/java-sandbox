/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edzzn
 */
package compositepattern;

import java.util.*;


public class SongGroup extends SongComponent {
    ArrayList songComponents = new ArrayList();
    
    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }
    
    public String getGroupName() {
        return this.groupName;
    }
    
    public String getGroupDescription() {
        return this.groupDescription;
    }
    
    public void add(SongComponent newSongComponent){
        songComponents.add(newSongComponent);
    }
           
    public void remove(SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }
    
    public SongComponent getSongComponent(int componentIndex){
        return (SongComponent) songComponents.get(componentIndex);
    }
    
    public void displaySongInfo(){
        System.out.println(getGroupName() + " " + getGroupDescription());
        
        Iterator songIterator = songComponents.iterator();
        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
    
    
}
