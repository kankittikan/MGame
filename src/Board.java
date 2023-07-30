import java.util.List;

public class Board {
    private List<Square> squares;

    public Board(List<Square> squares) {
        this.squares = squares;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Square square : squares) {
            stringBuilder.append(square.getName()).append(" ");
        }
        return stringBuilder.toString();
    }
}
