import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Tests our abstract {@link Shape} class and two concrete subclasses.
 * Credit to B.Evans and D.Flanagan's Java in a Nutshell for the idea / code.
 */
public class ShapeTester {

    //Make a List of Drawable things
    private static List<Drawable> drawables = new ArrayList<Drawable>();

    public static void main(String[] args) {


        /*
         * Make some shapes that we would like to be drawn. Remember that
         * the Shape class implements the Drawable interface so all subclasses
         * had to implement the draw method that is defined in the Drawable
         * interface.
        */
        Shape aCircle = new Circle(100,100,100.7);
        Shape aRectangle = new Rectangle(250,19, 25.5, 15.3);

        // Make duck to draw. This class implements the Drawable interface directly
        Duck quackers = new Duck("Sir Quackers");

        // Add all of the objects we made to our list of Drawable things.
        drawables.add(aCircle);
        drawables.add(aRectangle);
        drawables.add(quackers);
          
        setupDisplay();

    }

    /**
     * This is where the cool stuff happens. We have a {@link List} containing 
     * 'things' that conform to the {@link Drawable} interface. This means that,
     * whatever they are, we know they can be drawn via  draw() method.
    */
    public static void drawEverything(Graphics graphics) {
        graphics.setColor(Color.green);

        for(Drawable d: drawables) {
            d.draw(graphics);
        }
    }

    /** Ignore me I'm just here to make a little window we can use 
     * to draw on :)
     */
    public static void setupDisplay() {
        final int WIDTH = 400;
        final int HEIGHT = 400;

        JFrame frame = new JFrame("Shape Tests");
        Dimension size = new Dimension(WIDTH, HEIGHT);
        frame.setMinimumSize(size);
        frame.setPreferredSize(size);

        
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(0, 0, 400, 400);
                drawEverything(graphics);          
            }
        };
        
        panel.setBackground(Color.BLACK);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
