package cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    static {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime() {}

    public String getName() {
        return this.name;
    }

    public static int[] getEpisodes() {
        return Anime.episodes;
    }
}
