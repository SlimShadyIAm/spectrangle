package Models;

public enum SideColor {
    R, Y, G, B, P, W;

    public Character getChar() {
        return (name().charAt(0) + name().substring(1)).charAt(0);
    }
}
