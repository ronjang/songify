import java.util.ArrayList;

public class Medium {
    String title;
    Artist artist;
    String genre;
    int length;
    int releaseYear;

    public Medium(String title, Artist artist, String genre, int length, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.length = length;
        this.releaseYear = releaseYear;
    }

    public void play(){
        System.out.println("This medium is not playable.");
    }

    @Override
    public String toString() {
        return "Medium{" +
                "title='" + title + '\'' +
                '}';
    }
}
