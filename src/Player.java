import java.util.ArrayList;
import java.util.List;

public class Player {
    private Piece piece;
    private List<Die> dies;
    private Board board;
    private String name;

    public Player(Piece piece, Board board, String name, List<Die> dies) {
        this.piece = piece;
        this.board = board;
        this.name = name;
        this.dies = dies;
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
