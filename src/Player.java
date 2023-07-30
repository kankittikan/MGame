import java.util.ArrayList;
import java.util.List;

public class Player {
    private Piece piece;
    private List<Die> dies;
    private Board board;
    private String name;

    public Player(Piece piece, Board board, String name) {
        this.piece = piece;
        this.board = board;
        this.name = name;
        dies = new ArrayList<>();
        dies.add(new Die());
        dies.add(new Die());
    }

    public void takeTurn() {
        int fv = 0;
        for(Die die : dies) {
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

}
