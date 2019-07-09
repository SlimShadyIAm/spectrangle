package Models;

import java.util.Arrays;
import java.util.List;

public class Board {
    private List<Integer> bonuses =       Arrays.asList(1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 2, 4, 1, 4, 2, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 3, 1, 1, 1, 2, 1, 1, 1, 3, 1);
    private List<Integer> values =        Arrays.asList(null,   null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    private List<Character> vertical =    Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    private List<Character> left =        Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    private List<Character> right =       Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

    public void setIndex(Character vertical, Character left, Character right, Integer value, Integer index) {
        this.values.set(index, value);
        this.vertical.set(index, vertical);
        this.left.set(index, left);
        this.right.set(index, right);
    }

    public Board deepCopy() {
        Board board = new Board();
        for (int i = 0; i < 36; i++) {
            board.setIndex(this.vertical.get(i), this.left.get(i), this.right.get(i), this.values.get(i), i);
        }
        return board;
    }

    public List<Character> getVertical() {
        return vertical;
    }

    public List<Integer> getBonuses() {
        return bonuses;
    }

    public List<Character> getRight() {
        return right;
    }

    public List<Character> getLeft() {
        return left;
    }

    public List<Integer> getValues() {
        return values;
    }
}
