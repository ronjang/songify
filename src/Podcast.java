import java.util.ArrayList;

public class Podcast extends Medium {
    public Podcast(ArrayList<String> listWithPodcastNames,
                   String title,
                   Artist artist,
                   String genre,
                   int length,
                   int releaseYear)
    {
        super(title, artist, genre, length, releaseYear);
        listWithPodcastNames.add(this.title);
    }

    @Override
    public void play() {
        System.out.println("Now Playing: " + this.title);
    }


}
