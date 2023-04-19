import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> listWithAlbumNames = new ArrayList<String>();
        ArrayList<String> listWithSongNames = new ArrayList<String>();
        ArrayList<String> listWithPodcastNames = new ArrayList<String>();

        Artist tylerTheCreator = new Artist("Tyler", "the Creator");



        String worldInFlamesSongLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        String loveCraftSongLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        String jesusSongLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        String dogtoothSongLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        String hyperHardcoreSongLyrics = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";


        Podcast scienceCast = new Podcast(listWithPodcastNames,"Science Cast", new Artist("ZDF", "Redaktion"),"Wissenschaft", 10000, 2022);
        Podcast funPod = new Podcast(listWithPodcastNames,"Fun Pod", new Artist("strgF", "Redaktion"),"Comedy", 25000, 2021);


        Song worldInFlames = new Song(listWithSongNames,"World in Flames", new Artist("Franz", "Meyer"),"Metal", 160, 2022, worldInFlamesSongLyrics);
        Song dogtooth = new Song(listWithSongNames,"Dogtooth", tylerTheCreator,"Rap", 120, 2022, dogtoothSongLyrics);
        Song jesus = new Song(listWithSongNames,"Jesus", new Artist("Hans-Meyer", "P."),"Classic", 1590, 1857, jesusSongLyrics);
        Song loveCraft = new Song(listWithSongNames,"Love Craft", tylerTheCreator,"Rap", 160, 2022, loveCraftSongLyrics);
        Song hyperHardcore = new Song(listWithSongNames,"Hyper Hardcore", tylerTheCreator,"Hardstyle", 110, 2010, hyperHardcoreSongLyrics);



        Album legman = new Album(listWithAlbumNames,"Legman", tylerTheCreator, "Mixed",1234, 2023,new ArrayList<>(List.of(loveCraft,hyperHardcore,dogtooth)));
        System.out.println(legman.getMostPopularGenre());


        printWelcomeMessage(listWithSongNames,listWithAlbumNames,listWithPodcastNames);
        jesus.info(legman);


    }

    private static void printWelcomeMessage(ArrayList<String> listWithSongNames, ArrayList<String> listWithAlbumNames, ArrayList<String> listWithPodcastNames) {
        System.out.println("# Bienvenido a Songify!");
        System.out.print("Albums: ");
        for (String i : listWithAlbumNames
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Songs: ");
        for (String i : listWithSongNames
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Podcasts: ");
        for (String i : listWithPodcastNames
        ) {
            System.out.print(i + " ");
        }
    }

}