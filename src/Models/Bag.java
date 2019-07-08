package Models;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Tile> tiles;

    public Bag() {
        this.tiles = new ArrayList<Tile>(36);
//        All red, all blue, all green, all yellow, all purple (6 points each).
        tiles.add(new Tile(SideColor.R, SideColor.R, SideColor.R, 6));
        tiles.add(new Tile(SideColor.B, SideColor.B, SideColor.B, 6));
        tiles.add(new Tile(SideColor.G, SideColor.G, SideColor.G, 6));
        tiles.add(new Tile(SideColor.Y, SideColor.Y, SideColor.Y, 6));
        tiles.add(new Tile(SideColor.P, SideColor.P, SideColor.P, 6));


//        2 x red and yellow, 2 x red and purple, 2 x blue and red, 2 x blue and purple, 2 x green and red,
//        2 x green and blue, 2 x yellow and green, 2 x yellow and blue, 2 x purple and yellow,
//        2 xpurple and green (5 points each)
        tiles.add(new Tile(SideColor.R, SideColor.R, SideColor.Y, 5));
        tiles.add(new Tile(SideColor.R, SideColor.R, SideColor.P, 5));
        tiles.add(new Tile(SideColor.B, SideColor.B, SideColor.R, 5));
        tiles.add(new Tile(SideColor.B, SideColor.B, SideColor.P, 5));
        tiles.add(new Tile(SideColor.G, SideColor.G, SideColor.R, 5));
        tiles.add(new Tile(SideColor.G, SideColor.G, SideColor.B, 5));
        tiles.add(new Tile(SideColor.Y, SideColor.Y, SideColor.G, 5));
        tiles.add(new Tile(SideColor.Y, SideColor.Y, SideColor.B, 5));
        tiles.add(new Tile(SideColor.P, SideColor.P, SideColor.Y, 5));
        tiles.add(new Tile(SideColor.P, SideColor.P, SideColor.G, 5));

//        2 x red and blue, 2 x red and green, 2 x blue and green, 2 x blue and yellow, 2 x green and yellow,
//        2 x green and purple, 2 x yellow and red,2 x yellow and purple,2 x purple and red, 2 x purple
//        and blue (4 pointseach)
        tiles.add(new Tile(SideColor.R, SideColor.R, SideColor.B, 4));
        tiles.add(new Tile(SideColor.R, SideColor.R, SideColor.G, 4));
        tiles.add(new Tile(SideColor.B, SideColor.B, SideColor.G, 4));
        tiles.add(new Tile(SideColor.B, SideColor.B, SideColor.Y, 4));
        tiles.add(new Tile(SideColor.G, SideColor.G, SideColor.Y, 4));
        tiles.add(new Tile(SideColor.G, SideColor.G, SideColor.P, 4));
        tiles.add(new Tile(SideColor.Y, SideColor.Y, SideColor.R, 4));
        tiles.add(new Tile(SideColor.Y, SideColor.Y, SideColor.P, 4));
        tiles.add(new Tile(SideColor.P, SideColor.P, SideColor.R, 4));
        tiles.add(new Tile(SideColor.P, SideColor.P, SideColor.B, 4));

//        [yellow, blue, purple], [red, green, yellow], [blue, green, purple], [green, red, blue] (3 pointseach
        tiles.add(new Tile(SideColor.Y, SideColor.B, SideColor.P, 3));
        tiles.add(new Tile(SideColor.R, SideColor.G, SideColor.Y, 3));
        tiles.add(new Tile(SideColor.B, SideColor.G, SideColor.P, 3));
        tiles.add(new Tile(SideColor.G, SideColor.R, SideColor.B, 3));

//        [blue, red, purple], [yellow, purple, red], [yellow, purple, green] (2 pointseach)
        tiles.add(new Tile(SideColor.B, SideColor.R, SideColor.P, 2));
        tiles.add(new Tile(SideColor.Y, SideColor.P, SideColor.R, 2));
        tiles.add(new Tile(SideColor.Y, SideColor.P, SideColor.G, 2));

//        All white (joker, 1 point)
        tiles.add(new Tile(SideColor.W, SideColor.W, SideColor.W, 1));

    }
}
