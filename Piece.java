package chess;

public abstract class Piece {
    protected int x, y;
    protected boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public abstract boolean isLegalMove(int endX, int endY, Piece[][] board);
}