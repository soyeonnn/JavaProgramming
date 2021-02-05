import java.util.ArrayList;

public class Artist {
    private final String artistName;
    private final ArrayList<Album> albums = new ArrayList<>();

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() { return artistName; }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
}
