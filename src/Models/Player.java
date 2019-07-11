package Models;

import java.util.ArrayList;

public interface Player {
    public ArrayList<Tile> getHand();
    public void insertTileIntoHand(Tile tile);
    public void addPoints(int points);
    public Integer getPoints();
    public Integer determineIndex();
    public Tile determineTile();
    public String getUsername();
    public void setUsername(String username);
}
