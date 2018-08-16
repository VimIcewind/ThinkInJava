//: polymorphism/shape/Triangle.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-16.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
} ///:~
