/**
 * Base class for the shape inheritance hierarchy. All extending
 * classes must provide implementations for the area and circumference
 * methods.
 */
public abstract class Shape implements Drawable {

    private int x;
    private int y;

    public abstract double area();
    public abstract double circumference();

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
