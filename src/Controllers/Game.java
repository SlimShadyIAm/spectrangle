package Controllers;

import Models.Bag;
import Models.Board;
import Models.SideColor;
import Models.Tile;
import View.BoardView;
import View.TileView;

public class Game {
    private Board board;
    private Bag bag;
    private TileView tileView;
    private boolean firstMove;

    public Game() {
        this.board = new Board();
        this.bag = new Bag();
        this.tileView = new TileView();

        this.firstMove = true;
    }

    public void showBoard() {
        System.out.println(BoardView.getBoardString(this.board.getValues(), this.board.getVertical(), this.board.getLeft(), this.board.getRight()));
    }

    public void makeMove(Tile tile, Integer index) {
        SideColor[] sides = tile.getSides();
        this.board.setIndex(sides[0].getChar(), sides[1].getChar(), sides[2].getChar(), tile.getPointVal(), index);
    }

    public boolean validMove() {
        Board board = this.board.deepCopy();
        return false;
    }

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Tile tile = game.bag.getRandomTile();
        game.makeMove(tile, 2);
        game.showBoard();
    }
}
