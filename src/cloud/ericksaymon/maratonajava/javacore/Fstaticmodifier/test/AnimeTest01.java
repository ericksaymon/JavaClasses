package cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.test;

import cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();

        for(int episodes: Anime.getEpisodes()){
            System.out.print (episodes);
        }
    }
}
