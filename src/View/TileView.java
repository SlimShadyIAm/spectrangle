package View;

import Models.Tile;

public class TileView {
    public static String[] rightSideUpArray(Tile tile){
        String [] tileRepresentation = new String[6];
        tileRepresentation[0] = "       ^        ";
        tileRepresentation[1] = "      /  \\      ";
        tileRepresentation[2] = "     /  " + tile.getPointVal() + "  \\    ";
        tileRepresentation[3] = "    / " + tile.getSides()[0] + "    " + tile.getSides()[1] + " \\  ";
        tileRepresentation[4] = "   /     " + tile.getSides()[2] + "    \\ ";
        tileRepresentation[5] = "  --------------";

        return tileRepresentation;
    }

    public static String[] upsideDownArray(Tile tile) {
        String[] tileRepresentation = new String[6];
        tileRepresentation[0] = "  --------------";
        tileRepresentation[1] = "   \\     " + tile.getSides()[2] + "    / ";
        tileRepresentation[2] = "    \\ " + tile.getSides()[0] + "    " + tile.getSides()[1]+ " /  ";
        tileRepresentation[3] = "     \\  " + tile.getPointVal() + "  /    ";
        tileRepresentation[4] = "      \\  /      ";
        tileRepresentation[5] = "        v       ";

        return tileRepresentation;
    }

    public static void printVariations(String orientation, Tile tile) {
        String[] representationOne;
        String[] representationTwo;
        String[] representationThree;
        if (orientation.equals("UP")) {
            representationOne = TileView.rightSideUpArray(tile);
            tile.rotate();
            tile.rotate();
            representationTwo = TileView.rightSideUpArray(tile);
            tile.rotate();
            tile.rotate();
            representationThree = TileView.rightSideUpArray(tile);
            tile.rotate();
            tile.rotate();
        } else {
            tile.rotate();
            representationOne = TileView.upsideDownArray(tile);
            tile.rotate();
            tile.rotate();
            representationTwo = TileView.upsideDownArray(tile);
            tile.rotate();
            tile.rotate();
            representationThree = TileView.upsideDownArray(tile);
            tile.rotate();
        }

        String finalOutput = "";

        for (int i = 0; i < 6; i++) {
            finalOutput += representationOne[i] + representationTwo[i] + representationThree[i];
            finalOutput += "\n";
        }

        System.out.println(finalOutput);
    }

    public static void printTile(String orientation, Tile tile) {
        String[] tileRepresentation;
        if (orientation.equals("UP")) {
            tileRepresentation = TileView.rightSideUpArray(tile);

        } else {
            tileRepresentation = TileView.upsideDownArray(tile);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(tileRepresentation[i]);
        }
        System.out.println();
    }
}

