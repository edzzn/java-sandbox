package compositepattern;

/*
 * Song Information
 */
/**
 *
 * @author edzzn
 */
public class Song extends SongComponent {

    private String songName;
    private String bandName;
    private int releaseYear;

    public Song(String songName, String bandName, int realeaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = realeaseYear;
    }

    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());

    }

    /**
     * @return the songName
     */
    public String getSongName() {
        return songName;
    }

    /**
     * @param songName the songName to set
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * @return the bandName
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * @param bandName the bandName to set
     */
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    /**
     * @return the realeaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * @param realeaseYear the realeaseYear to set
     */
    public void setRealeaseYear(int realeaseYear) {
        this.releaseYear = realeaseYear;
    }
}
