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

    public static void main(String[] args) {

        List<Drawable> drawables = new ArrayList<>();

        /*
         * Would result in a compile error as we cannot 
         * create an instanct of an abstract class
         */
        //Shape anImaginaryShape = new Shape(1,1);

        Shape aCircle = new Circle(100,100,100.7);
        Shape aRectangle = new Rectangle(250,19, 25.5, 15.3);

        Duck quackers = new Duck("Sir Quackers");

        drawables.add(aCircle);
        drawables.add(aRectangle);
        drawables.add(quackers);
   
    }

    public static void drawEverything(Graphics graphics) {
        graphics.setColor(Color.green);

        for(Drawable d: drawables) {
            d.draw(graphics);
        }
    }

    /** Ignore me I'm just here to make a little window we can use 
     * to draw one :)
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
