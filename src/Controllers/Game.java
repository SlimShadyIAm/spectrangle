package Controllers;

import Models.Bag;
import Models.Board;
import Models.SideColor;
import Models.Tile;
import View.BoardView;
import View.TileView;
import Models.Utils;

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

    public int makeMove(Tile tile, Integer index) {
        SideColor[] sides = tile.getSides();
        if (this.validMove(index, tile)) {
            this.board.setIndex(sides[0].getChar(), sides[1].getChar(), sides[2].getChar(), tile.getPointVal(), index);
            return Math.max(1, noOfMatchingSides(this.getBoard(), index, tile)) * tile.getPointVal() * this.getBoard().getBonuses().get(index);
        } else {
            return -1;
        }
    }

    public boolean validMove(Integer index, Tile tile) {
        if (Utils.isValidField(index)) {
            return false;
        }

        if (firstMove && this.getBoard().isBonusField((index))) {
            return false;
        } else if (firstMove && !this.getBoard().isBonusField(index)) {
            return true;
        }

        Board board = this.board.deepCopy();
        return this.noOfMatchingSides(board, index, tile) != 0;
    }

    public Integer noOfMatchingSides(Board board, Integer index, Tile tile) {
        int counter = 0;

//        does a left field exist?
        if (Utils.getLeftIndex(index) != -1) {
            if (this.checkMatchingLeft(board, index)) {
                counter++;
            }
        }
//        does a right field exist?
        if (Utils.getRightIndex(index) != -1) {
            if (this.checkMatchingRight(board, index)) {
                counter++;
            }
        }
//        is this field upside down?
        if (Utils.isUpsideDown(index)) {
//            yes, let's check the tile above us
            if (Utils.getUpIndex(index) != -1) {
                if (this.checkMatchingUp(board, index)) {
                    counter++;
                }
            }
        } else {
//            no, it's right side up, let's check under us
            if (Utils.getDownIndex(index) != -1) {
                if (this.checkMatchingDown(board, index)) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public boolean checkMatchingLeft(Board board, Integer index) {
        int leftIndex = Utils.getLeftIndex(index);
        return board.getRight().get(leftIndex) == board.getLeft().get(index);
    }

    public boolean checkMatchingRight(Board board, Integer index) {
        int rightIndex = Utils.getRightIndex(index);
        return board.getLeft().get(rightIndex) == board.getRight().get(index);
    }

    public boolean checkMatchingUp(Board board, Integer index) {
        int upIndex = Utils.getUpIndex(index);
        return board.getVertical().get(upIndex) == board.getVertical().get(index);
    }

    public boolean checkMatchingDown(Board board, Integer index) {
        int downIndex = Utils.getDownIndex(index);
        return board.getVertical().get(downIndex) == board.getVertical().get(index);
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
