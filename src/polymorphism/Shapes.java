//: polymorphism/Shapes.java
// Polymorphism in java.
package polymorphism;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * Created by HWD on 2018-8-16.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        // Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
            shp.amend();
        }
    }
} /* Output:
Triangle.draw()
Triangle.amend()
Triangle.draw()
Triangle.amend()
Square.draw()
Square.erase()
Triangle.draw()
Triangle.amend()
Square.draw()
Square.erase()
Triangle.draw()
Triangle.amend()
Square.draw()
Square.erase()
Triangle.draw()
Triangle.amend()
Circle.draw()
Circle.amend()
*///:~
