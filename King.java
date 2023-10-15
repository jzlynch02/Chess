package chess;

public class King extends Piece {

    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        int xDiff = Math.abs(endX - x);
        int yDiff = Math.abs(endY - y);

        // King can move one square in any direction
        if (xDiff <= 1 && yDiff <= 1) {
            return true;
        }
        // Add logic for castling here
        return false;
    }
}
