import javax.sql.ConnectionPoolDataSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Songify {

    public static Artist tylerTheCreator = new Artist("Tyler", "the Creator");
    public static String genericLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";


    ArrayList<Song> allSongs = new ArrayList<>();
    ArrayList<Podcast> allPodcasts = new ArrayList<>();
    ArrayList<Album> allAlbums = new ArrayList<>();
    ArrayList<Playlist> allPlaylists = new ArrayList<>();
    public Songify() throws CatException {
        Main main = new Main();
        try {
            allSongs.addAll(List.of(
                    new Song("World in Flames", new Artist("Franz", "Meyer"), "Metal", 160, 2022, genericLyrics),
                    new Song("Dogtooth", tylerTheCreator, "Rap", 120, 2022, genericLyrics),
                    new Song("Jesus", new Artist("Hans-Meyer", "P."), "Classic", 1590, 1857, genericLyrics),
                    new Song("Love Craft", tylerTheCreator, "Rap", 160, 2022, genericLyrics),
                    new Song("Hyper Hardcore", tylerTheCreator, "Hardstyle", 110, 2010, genericLyrics)));
            allPodcasts.addAll(List.of(
                    new Podcast("Science Cast", new Artist("ZDF", "Redaktion"), "Wissenschaft", 10000, 2022),
                    new Podcast("Fun Pod", new Artist("strgF", "Redaktion"), "Comedy", 25000, 2021),
                    new Podcast("Jesus liebt dich", new Artist("strgF", "Redaktion"), "Comedy", 25000, 2021),
                    new Podcast("Jesus schiesst ein Tor im Derby", new Artist("strgF", "Redaktion"), "Comedy", 25000, 1700),
                    new Podcast("Jesus, der Podcast", new Artist("Hans-Meyer", "P. 2"), "Classic", 1590, 1857)));
            allAlbums.add(new Album("Legman", tylerTheCreator, 1234, 2023,
                    allSongs.stream().filter(song -> song.getTitle().equals("Dogtooth") || song.getTitle().equals("Hyper Hardcore") || song.getTitle().equals("Love Craft")).toList()));
            allPlaylists.addAll(List.of(
                    new Playlist("deez nuts", new Artist ("Bing", "Qillin"), 2023)));
            allPlaylists.get(0).addMedia(allSongs.get(3));
            allPlaylists.get(0).addMedia(allAlbums.get(0));

        } catch (Exception e) {
            System.out.println("Katze gefunden.");
        }
    }

    public void printSearchResults(String title) {
        ArrayList<Medium> results = new ArrayList<Medium>();
        for (int i = 0; i < allSongs.size(); i++) {
            if (allSongs.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(allSongs.get(i));
            }
        }
        for (int i = 0; i < allPodcasts.size(); i++) {
            if (allPodcasts.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(allPodcasts.get(i));
            }
        }
        for (int i = 0; i < allAlbums.size(); i++) {
            if (allAlbums.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(allAlbums.get(i));
            }
        }
        List<Medium> nameSortedResults = results.stream().sorted(((o1, o2) -> o1.title.compareTo(o2.title))).toList();
        List<Medium> sortedResults = nameSortedResults.stream().sorted((o1, o2) -> Integer.compare(o1.getReleaseYear(), o2.getReleaseYear())).toList();

            if (results.size() == 0) {
                System.out.println("Die Suche ergab keine resultados.");
            } else {
                System.out.println("## Sucheregebnisse: ");
                for (int i = 0; i < sortedResults.size(); i++) {
                    System.out.println(sortedResults.get(i).getClass()+ ": " + sortedResults.get(i).title + "\n" +
                                        "Veroeffentlichungsjahr: " + sortedResults.get(i).getReleaseYear() + "\n");
                }

            }



    }
}