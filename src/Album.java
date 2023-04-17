import java.util.ArrayList;

public class Album extends Medium{
    ArrayList<Song> songList;
    public Album(ArrayList<String> listWithAlbumNames, String title, Artist artist, String genre, int length, int releaseYear, ArrayList<Song> songList) {
        super(title, artist, genre, length, releaseYear);
        this.songList = songList;
        listWithAlbumNames.add(this.title);
    }
    public String getFirstSongName(ArrayList<Song> songList){
        return songList.get(0).getTitle();
    }
    @Override
    public void play() {
        System.out.println("Now Playing: " + getFirstSongName(songList));
    }
}
