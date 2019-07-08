package Models;

public enum SideColor {
    R, Y, G, B, P, W;

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
