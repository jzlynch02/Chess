package chess;

public class Queen extends Piece {

    public Queen(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        // Queen can move like a rook or a bishop
        // Check for straight line movement (like rook)
        if (x == endX || y == endY) {
            return true;
        }
        // Check for diagonal movement (like bishop)
        if (Math.abs(endX - x) == Math.abs(endY - y)) {
            return true;
        }
        return false;
    }
}
