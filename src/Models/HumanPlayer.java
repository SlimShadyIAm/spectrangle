package Models;

import java.util.ArrayList;

public class HumanPlayer implements Player {
    private ArrayList<Tile> hand;
    private Integer points;
    private String username;

    public HumanPlayer() {
        this.hand = new ArrayList<>();
        this.points = 0;
    }

    @Override
    public ArrayList<Tile> getHand() {
        return this.hand;
    }

    @Override
    public void insertTileIntoHand(Tile tile) {
        this.getHand().add(tile);
    }

    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public Integer getPoints() {
        return null;
    }

    @Override
    public Integer determineIndex() {
        return null;
    }

    @Override
    public Tile determineTile() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
}
