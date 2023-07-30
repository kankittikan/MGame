public class Piece {
    private Square location;
    private Color color;

    public Piece(Square location, Color color) {
        this.location = location;
        this.color = color;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
