package cloud.ericksaymon.maratonajava.javacore.Cmethodsoverloading.test;

import cloud.ericksaymon.maratonajava.javacore.Cmethodsoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku no Hero Academia", "TV", 25);
        anime.init("Boku no Hero Academia", "TV", 25, "Action");
        anime.printData();
    }
}

