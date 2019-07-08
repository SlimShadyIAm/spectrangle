package Models;

import View.TileView;

public class Tile {
    private SideColor sideOne;
    private SideColor sideTwo;
    private SideColor sideThree;
    private Integer pointVal;
    private Integer rotation;

    public Tile(SideColor sideOne, SideColor sideTwo,  SideColor sideThree, Integer pointVal) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

        this.rotation = 0;
        this.pointVal = pointVal;
    }

    public SideColor[] getSides() {
        return new SideColor[] {this.sideOne, this.sideTwo, this.sideThree};
    }

    public Integer getPointVal() {
        return this.pointVal;
    }

    public void rotate() {
        this.rotation++;
        this.rotation = this.rotation % 6;
        SideColor tempSideOne = this.sideOne;
        SideColor tempSideTwo = this.sideTwo;
        SideColor tempSideThree = this.sideThree;

        if (this.rotation % 2 == 1) {
            this.sideThree = tempSideOne;
            this.sideTwo = tempSideTwo;
            this.sideOne = tempSideThree;
        } else {
            this.sideThree = tempSideTwo;
            this.sideTwo = tempSideThree;
            this.sideOne = tempSideOne;
        }
    }

    public static void main(String[] args) {
        Tile tile = new Tile(SideColor.R, SideColor.Y, SideColor.B, 5);
        TileView.printVariations("UP", tile);
    }
}
