import java.awt.Graphics;

/** Represents a simple Rectangle that extends the abstract {@link Shape} class
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(int x, int y, double width, double height) {
        super(x,y);
        this.width = width;
        this.height = height;
    } 

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double circumference() {
        return 2 * (width + height);
    }

    @Override
    public void draw(Graphics g){
        g.drawRect(getX(), getY(), (int)width, (int)height);
    }

    public double getWidth() { 
        return width; 
    }
    
    public double getHeight() { 
        return height; 
    }
}
