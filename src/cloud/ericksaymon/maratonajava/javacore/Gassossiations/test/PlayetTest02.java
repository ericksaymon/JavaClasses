package cloud.ericksaymon.maratonajava.javacore.Gassossiations.test;

import cloud.ericksaymon.maratonajava.javacore.Gassossiations.domain.Player;
import cloud.ericksaymon.maratonajava.javacore.Gassossiations.domain.Team;

public class PlayetTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("CBF");

        player1.setTeam(team1);
        player1.printData();
    }
}
