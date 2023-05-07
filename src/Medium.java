public class Medium {
    String title;
    Artist artist;
    String genre;
    int length;
    int releaseYear;

    public Medium(String title, Artist artist, String genre, int length, int releaseYear) {


            if (!title.equalsIgnoreCase("cat")){
                this.title = title;
            } else {
                this.title = "Raub " + title;
                throw new CatException();
            }


        this.artist = artist;
        this.genre = genre;
        this.length = length;
        this.releaseYear = releaseYear;
    }


    public void info() {
        System.out.println("This Medium has no Data");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
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
