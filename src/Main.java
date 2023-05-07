import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Songify songify = new Songify();



        printWelcomeMessage();


        Playlist sheesh = new Playlist("Sheesh", new Artist("Ronny", "Manjang"),2023);
        sheesh.addMedia(songify.allAlbums.get(0));
        sheesh.info();


    }

    private static void printWelcomeMessage(){
        System.out.println("# Bienvenido a Songify!");
        System.out.println("## Höre ein Album: ");
        Songify songify = new Songify();
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int randomAlbum=rand.nextInt(songify.allAlbums.size());
            songify.allAlbums.get(randomAlbum).info();
        }
        System.out.println();
        System.out.println("## Höre einen Song: ");
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int randomSong=rand.nextInt(songify.allSongs.size());
            songify.allSongs.get(randomSong).info();
        }
        System.out.println();
        System.out.println("## Höre einen Podcasts: ");
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int randomPodcast=rand.nextInt(songify.allPodcasts.size());
            songify.allPodcasts.get(randomPodcast).info();
        }
    }

}