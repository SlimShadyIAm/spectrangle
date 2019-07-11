package View;

import Models.Bag;
import Models.Tile;
import Models.Utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanView {
    public static Integer determineIndex() {
        int index;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter an index you would like to place your tile on! [0-35]: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Try again [0-35]: ", input);
            }
            index = scanner.nextInt();
        } while (index < 0 || index > 35);
        scanner.close();
        return index;
    }

    public static Tile determineTile(ArrayList<Tile> tileArrayList, Integer index) {
        int tileNumber;
        Tile tile;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Which tile do you want to place? [0-" + (tileArrayList.size() - 1) + ": ");
            TileView.printHandVarations(Utils.indexOrientation(index), tileArrayList);
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Try again [0-" + (tileArrayList.size() - 1) + "]: ", input);
            }
            index = scanner.nextInt();
        } while (index < 0 || index > (tileArrayList.size() - 1));
    }

    public static void main(String[] args) {
        Bag bag = new Bag();
        ArrayList<Tile> hand = new ArrayList<>();
        hand.add(bag.getRandomTile());
        hand.add(bag.getRandomTile());
        hand.add(bag.getRandomTile());
        hand.add(bag.getRandomTile());
        HumanView.determineTile(hand, 1);
    }
}

