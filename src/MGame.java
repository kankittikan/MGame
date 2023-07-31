import javax.swing.*;
import java.util.List;

public class MGame {

    private List<Player> players;
    private Board board;
    private int roundCat;
    private int n;

    public MGame(List<Player> players, Board board, int n, List<Die> dices) {
        this.players = players;
        this.board = board;
        this.n = n;

        roundCat = 0;
    }

    public void playGame() {
        while (roundCat < n) {
            System.out.println("Round: " + roundCat);
            playRound();
            roundCat++;
        }
    }

    private void playRound() {
        for(Player player : players) {
            player.takeTurn();
            System.out.println(board);
        }
    }
}
