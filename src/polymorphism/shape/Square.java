//: polymorphism/shape/Square.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-16.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
}
