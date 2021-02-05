public class Song {
    private final String songName;
    private final Artist artist;
    private final Album album;

    public Song(String songName, Artist artist, Album album) {
        this.songName = songName;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public String toString() {
        String info = "";
        info = songName + " - " + artist.getArtistName() + "\n" + album.getAlbumName() + "(" + album.getReleaseYear() + ")";
        return info;
    }
}
