package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-18.
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        print("Rectangle.draw()");
    }

    @Override
    public void erase() {
        print("Rectangle.erase()");
    }

    @Override
    public void amend() {
        print("Rectangle.amend()");
    }
}
