
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Album extends Medium{
    List<Song> songList;
    public Album(String title, Artist artist, int length, int releaseYear, @org.jetbrains.annotations.NotNull List<Song> songList) {

        super(title, artist, null, length, releaseYear);
        this.songList = songList;
        songList.stream().distinct();
        genre = getMostPopularGenre();
    }


    public String getMostPopularGenre(){
        String mostPopularGenre = "";
        Map<String, Integer> genres = new HashMap<>();
        for (Song song : this.songList) {
            genres.merge(song.getGenre(), 1, Integer::sum);
        }
        for (Song song : this.songList) {
            int valueOfCurrentMostPopularGenre = 0;
            if (genres.get(song.genre) > valueOfCurrentMostPopularGenre) {
                mostPopularGenre = song.genre;
                valueOfCurrentMostPopularGenre = genres.get(song.genre);
            }
        }

        return mostPopularGenre;
    }
    public void info() {
        System.out.println("ALBUM("+
                this.title+ ", " +
                this.artist.firstName+ " " + this.artist.lastName + ", " +
                this.releaseYear+ ", " +
                this.songList.stream().map(Medium::getLength).reduce(0, Integer::sum).toString()+ " Seconds" +", " +
                this.getMostPopularGenre()+ ")");
    }
    public String getFirstSongName(List<Song> songList){
        return songList.get(0).getTitle();
    }


    @Override
    public void play() {
        System.out.println("Now Playing: " + getFirstSongName(songList));
    }
}
