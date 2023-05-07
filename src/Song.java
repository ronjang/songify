import java.util.ArrayList;

public class Song extends Medium{
    String lyrics;
    public Song(String title, Artist artist, String genre, int length, int releaseYear, String lyrics) throws CatException {
        super(title, artist, genre, length, releaseYear);
        this.lyrics = lyrics;

    }

    public String getTitle() {
        return title;
    }

    public void info() {
        System.out.println("SONG("+
                this.title+ ", " +
                this.artist.firstName+ " " + this.artist.lastName + ", " +
                this.releaseYear+ ", " +
                this.length+ " Seconds" +", " +
                this.genre+ ", " +
                this.lyrics.split("\\s").length + ")");
    }

    @Override
    public void play() {
        System.out.println("Now Playing: " + this.title);
    }
}
