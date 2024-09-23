package cloud.ericksaymon.maratonajava.javacore.Cmethodsoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int numberOfEpisodes;
    private String genre;

    public void printData() {
        System.out.println("Anime Name: " + this.name);
        System.out.println("Anime Type: " + this.type);
        System.out.println("Anime Genre: " + this.genre);
        System.out.println("Number of Episodes: " + this.numberOfEpisodes);
    }

    public void init(String name, String type, int numberOfEpisodes) {
        this.name = name;
        this.type = type;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void init(String name, String type, int numberOfEpisodes, String genre) {
        this.init(name, type, numberOfEpisodes);
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }
}
