import java.util.ArrayList;
import java.util.List;
/**
 * Tests our abstract {@link Shape} class and two concrete subclasses.
 * Credit to B.Evans and D.Flanagan's Java in a Nutshell for the idea / code.
 */
public class ShapeTester {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        /*
         * Would result in a compile error as we cannot 
         * create an instanct of an abstract class
         */
        Shape anImaginaryShape = new Shape(1,1);

        Shape aCircle = new Circle(1,1,100.7);
        Shape aRectangle = new Rectangle(1,1, 25.5, 15.3);


        shapes.add(aCircle);
        shapes.add(aRectangle);

        for(Shape aShape: shapes) {
            System.out.println("area="+aShape.area());
            System.out.println("circumference="+aShape.circumference());
        }
    }
}
