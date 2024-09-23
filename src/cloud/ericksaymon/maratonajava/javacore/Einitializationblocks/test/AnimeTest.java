package cloud.ericksaymon.maratonajava.javacore.Einitializationblocks.test;

import cloud.ericksaymon.maratonajava.javacore.Einitializationblocks.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku no Hero");
        for (int episode : anime.getEpisodes()) {
            System.out.println(episode + " ");
        }

    }
}
