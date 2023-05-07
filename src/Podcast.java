import java.util.ArrayList;

public class Podcast extends Medium {
    public Podcast(
                   String title,
                   Artist artist,
                   String genre,
                   int length,
                   int releaseYear) throws CatException {
        super(title, artist, genre, length, releaseYear);

    }
    public void info() {
        System.out.println("PODCAST("+
                this.title+ ", " +
                this.artist.firstName+ " " + this.artist.lastName + ", " +
                this.releaseYear+ ", " +
                this.length+ " Seconds" +", " +
                this.genre+ ")");
    }

    @Override
    public void play() {
        System.out.println("Now Playing: " + this.title);
    }


}
