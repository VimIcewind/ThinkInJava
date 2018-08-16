//: polymorphism/shape/Circle.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-16.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
