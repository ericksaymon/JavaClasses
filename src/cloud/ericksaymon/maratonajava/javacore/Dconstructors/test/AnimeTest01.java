package cloud.ericksaymon.maratonajava.javacore.Dconstructors.test;

import cloud.ericksaymon.maratonajava.javacore.Dconstructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku no Hero Academia", "TV", 25, "Action");
        anime.printData();
    }
}

