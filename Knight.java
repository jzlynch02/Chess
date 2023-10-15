package chess;

public class Knight extends Piece {

    public Knight(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        int xDiff = Math.abs(endX - x);
        int yDiff = Math.abs(endY - y);

        // Check the L-shape movement of the knight
        if ((xDiff == 1 && yDiff == 2) || (xDiff == 2 && yDiff == 1)) {
            return true;
        }
        return false;
    }
}
