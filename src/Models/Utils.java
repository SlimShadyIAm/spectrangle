package Models;

import java.util.HashMap;

public class Utils {
    private static HashMap<Integer, int[]> indexMap;

    public Utils() {
        indexMap = new HashMap<>();
        for (int row = 0; row <= 5; row++) {
            for (int col = 0 - row; col <= row; col++) {
                indexMap.put((int) (Math.pow(row, 2) + row + col), new int[]{row, col});
            }
        }
    }

    public static boolean isUpsideDown(int row, int col) {
        return  ((row + col) % 2 != 0);
    }

    public static boolean isUpsideDown(int index) {
        return Utils.isUpsideDown(Utils.getRow(index), Utils.getCol(index));
    }

    public static String indexOrientation(int index) {
        if (Utils.isUpsideDown(index)) {
            return "UP";
        } else {
            return "DOWN";
        }
    }

    public static boolean isValidField(int index) {
        return index >= 0 && index < 36;
    }

    public static boolean isValidField(int row, int col) {
        return Utils.isValidField(Utils.getIndex(row, col));
    }
    public static int getRow(int index) {
        return Utils.indexMap.get(index)[0];
    }

    public static int getCol(int index) {
        return Utils.indexMap.get(index)[1];
    }

    public static int getIndex(int row, int col) {
        return (int) (Math.pow(row, 2) + row + col);
    }

    public static int getLeftIndex(Integer index) {
        if (Utils.isValidField(Utils.getRow(index), Utils.getCol(index) - 1)) {
            return getIndex(Utils.getRow(index), Utils.getCol(index) - 1);
        } else {
            return -1;
        }
    }

    public static int getRightIndex(Integer index) {
        if (Utils.isValidField(Utils.getRow(index), Utils.getCol(index) + 1)) {
            return getIndex(Utils.getRow(index), Utils.getCol(index) + 1);
        } else {
            return -1;
        }
    }

    public static int getUpIndex(Integer index) {
        if (Utils.isValidField(Utils.getRow(index) - 1, Utils.getCol(index))) {
            return getIndex(Utils.getRow(index) - 1, Utils.getCol(index));
        } else {
            return -1;
        }
    }

    public static int getDownIndex(Integer index) {
        if (Utils.isValidField(Utils.getRow(index) + 1, Utils.getCol(index))) {
            return getIndex(Utils.getRow(index) + 1, Utils.getCol(index));
        } else {
            return -1;
        }
    }
}
