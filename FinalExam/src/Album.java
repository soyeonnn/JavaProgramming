import java.util.ArrayList;

public class Album {
    private final String albumName;
    private final int releaseYear;
    private final Artist artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String albumName, int releaseYear, Artist artist) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.artist = artist;
    }

    public String getAlbumName() { return albumName; }

    public int getReleaseYear() { return releaseYear; }

    public void addTrack(Song song) {
        songs.add(song);
    }

    public Song getTrack(int trackNum) {
        return songs.get(trackNum-1);
    }
}
