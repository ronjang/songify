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

    public void info(Song song) {
        System.out.println("SONG("+
                song.title+ ", " +
                song.artist.firstName+ " " + song.artist.lastName + ", " +
                song.releaseYear+ ", " +
                song.length+ " Seconds" +", " +
                song.genre+ ", " +
                song.lyrics.split("\\s").length + ")");
    }

    public void info(Podcast podcast) {
        System.out.println("PODCAST("+
                podcast.title+ ", " +
                podcast.artist.firstName+ " " + podcast.artist.lastName + ", " +
                podcast.releaseYear+ ", " +
                podcast.length+ " Seconds" +", " +
                podcast.genre+ ")");
    }
    public void info(Album album) {
        System.out.println("ALBUM("+
                album.title+ ", " +
                album.artist.firstName+ " " + album.artist.lastName + ", " +
                album.releaseYear+ ", " +
                album.songList.stream().map(song -> song.getLength()).reduce(0,(a,b) -> a+b).toString()+ " Seconds" +", " +
                album.getMostPopularGenre()+ ")");
    }
    public void play(){
        System.out.println("This medium is not playable.");
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Medium{" +
                "title='" + title + '\'' +
                '}';
    }
}
