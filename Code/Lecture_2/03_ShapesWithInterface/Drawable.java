import java.awt.Graphics;
/** All implementing classes should provide a method that can be called to
 * render said object to the screen using a Graphics objects. An object's
 * representation is left entirely up to the implementer.
 */
public interface Drawable {
    public void draw(Graphics g);
}
