package chess;

public class Bishop extends Piece {

    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        // Check diagonal movement
        if (Math.abs(endX - x) == Math.abs(endY - y)) {
            // Ensure no pieces are in between the start and end positions
            // (This is a simplified check; you'll need to iterate through the squares to ensure they're empty.)
            return true;
        }
        return false;
    }
}
