import java.util.ArrayList;
import java.util.List;

public class Playlist extends Medium{
    List<Medium> mediaList = new ArrayList<>();
    int length;
    public Playlist(String title, Artist artist, int releaseYear) {
        super(title, artist, null, 0, releaseYear);
    }

    public boolean addMedia(Medium medium){
        try {
            if (medium instanceof Playlist){
                throw new PlaylistException();
            }
            if (medium instanceof Album) {
                mediaList.addAll(((Album) medium).songList);
                return true;
            }
            if (medium instanceof Song | medium instanceof Podcast){
                mediaList.add(medium);
                return true;
            }
        } catch (PlaylistException e){
            System.err.println("Error: Item couldn't be added.");
            return false;
        }
        length = this.mediaList.stream().map(Medium::getLength).reduce(0, Integer::sum);
        return false;
    }

}
