package chess;

public class Rook extends Piece {

    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        // Implement rook's move logic here
        // Check if the path is clear, etc.
        return false;
    }
}