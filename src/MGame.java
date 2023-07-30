import java.util.List;

public class MGame {
    private Die die1;
    private Die die2;
    private List<Player> players;
    private Board board;
    private int roundCat;

    public MGame(List<Player> players, Board board, int roundCat) {
        this.players = players;
        this.board = board;
        this.roundCat = roundCat;
        die1 = new Die();
        die2 = new Die();
    }

    public void playGame() {

    }

    private void playRound() {

    }
}
