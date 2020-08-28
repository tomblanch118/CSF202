import java.awt.Color;
import java.awt.Graphics;

/** Duck class represents a duck... obviously.
 * This is a very simple duck that just has a name and is 
 * quite shouty.
 */
public class Duck implements Drawable{

    private String name;
    
    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.MAGENTA);
        g.drawString("QUACK! QUACK!", 20, 20);

        g.setColor(c);
    }
}
