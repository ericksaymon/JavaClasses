package cloud.ericksaymon.maratonajava.javacore.Gassossiations.test;

import cloud.ericksaymon.maratonajava.javacore.Gassossiations.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Player player02 = new Player("Maradona");
        Player player03 = new Player("Salah");
        Player[] players = {player01, player02, player03};
        for (Player player : players) {
            player.printData();
        }
    }
}
