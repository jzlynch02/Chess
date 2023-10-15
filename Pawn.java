package chess;

public class Pawn extends Piece {

    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isLegalMove(int endX, int endY, Piece[][] board) {
        // Implement pawn's move logic here
        // This is just a basic example, you'll need to expand on this
        if (isWhite) {
            if (y + 1 == endY && x == endX && board[endX][endY] == null) {
                return true;
            }
            // Add other conditions like capturing, en passant, etc.
        } else {
            // Logic for black pawn
        }
        return false;
    }
}