package pl.edu.mimuw.chess;

public abstract class AbstractPiece implements ChessPiece {

  private V2 position;
  private final ChessColor color;
  private final String whiteRepresentation;
  private final String blackRepresentation;

  protected AbstractPiece(V2 position, ChessColor color, String whiteRepresentation, String blackRepresentation) {
    this.position = position;
    this.color = color;
    this.whiteRepresentation = whiteRepresentation;
    this.blackRepresentation = blackRepresentation;
  }

  @Override
  public V2 getPosition() {
    return position;
  }

  @Override
  public void setPosition(V2 v) {
    this.position = v;
  }

  public ChessColor getColor() {
    return this.color;
  }

  @Override
  public String representation() {
    switch (color) {
      case BLACK:
        return blackRepresentation;
      case WHITE:
        return whiteRepresentation;
    }
    throw new IllegalStateException("unknown color " + color);
  }

  @Override
  public String toString() {
    return this.representation() + ": " + this.getPosition().toString();
  }
}
