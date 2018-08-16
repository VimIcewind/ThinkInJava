//: polymorphism/shape/Square.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-16.
 */
public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}
