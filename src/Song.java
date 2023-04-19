import java.util.ArrayList;

public class Song extends Medium{
    String lyrics;
    public Song(ArrayList<String> listWithSongNames,String title, Artist artist, String genre, int length, int releaseYear, String lyrics) {
        super(title, artist, genre, length, releaseYear);
        this.lyrics = lyrics;
        listWithSongNames.add(this.title);
    }

    public String getTitle() {
        return title;
    }



    @Override
    public void play() {
        System.out.println("Now Playing: " + this.title);
    }
}
