public class Player {
    private Piece piece;
    private Die die1;
    private Die die2;
    private Board board;
    private String name;

    public Player(Piece piece, Board board, String name) {
        this.piece = piece;
        this.board = board;
        this.name = name;
        die1 = new Die();
        die2 = new Die();
    }

    public void takeTurn() {

    }

}
