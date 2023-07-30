import java.util.ArrayList;
import java.util.List;

public class Piece {
    private static final List<Piece> pieces = new ArrayList<>();
    private Square location;
    private final Color color;

    public Piece(Square location, Color color) {
        this.location = location;
        this.color = color;
        pieces.add(this);
    }

    public Square getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public static List<Piece> getPieceBySquare(Square square) {
        List<Piece> out = new ArrayList<>();
        for(Piece piece : pieces) {
            if(piece.location == square) {
                out.add(piece);
            }
        }
        return out;
    }

    @Override
    public String toString() {
        return color + "";
    }
}
