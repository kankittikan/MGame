import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Square> squares = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            // using number for square name
            squares.add(new Square(String.valueOf(i)));
        }

        Board board = new Board(squares);

        List<Die> dieList = new ArrayList<>();
        dieList.add(new Die());
        dieList.add(new Die());

        List<Player> players = new ArrayList<>();
        players.add(new Player(new Piece(squares.get(0), Color.BLUE), board, "Tom", dieList));
        players.add(new Player(new Piece(squares.get(0), Color.RED), board, "Jerry", dieList));
        players.add(new Player(new Piece(squares.get(0), Color.PINK), board, "Doo", dieList));

        MGame mGame = new MGame(players, board, 10, dieList);
        mGame.playGame();
    }
}
