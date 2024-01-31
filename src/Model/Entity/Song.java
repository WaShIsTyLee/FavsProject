package Model.Entity;

public class Song extends Favs{
    private String artist;

    public Song(String name, String ID, String artist) {
        super(name, ID);
        this.artist = artist;
    }

    public Song(String artist) {
        super();
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
