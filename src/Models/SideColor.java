package Models;

public enum SideColor {
    R, O, Y, G, B, P;

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
