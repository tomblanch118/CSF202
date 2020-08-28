import java.awt.Graphics;

/** A class that represents a simple circle with a circumference
 * and x/y location. Extends the {@link Shape} class and provides implementations
 * for area and circumference methods.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(int x, int y, double radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), (int)radius, (int)radius);
    }

    public double getRadius() { 
        return radius;
    }
}

