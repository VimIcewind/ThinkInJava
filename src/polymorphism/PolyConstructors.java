//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-20.
 */
class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int length = 2;
    private int width = 4;

    RectangularGlyph(int l, int w) {
        length = l;
        width = w;
        print("RectangularGlyph.RectangularGlyph(), length = "
                + length + ", width" + width);
    }

    void draw() {
        print("RectangularGlyph.draw(), length = " + length
                + ", with = " + width);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(3, 6);
    }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
Glyph() before draw()
RectangularGlyph.draw(), length = 0, with = 0
Glyph() after draw()
RectangularGlyph.RectangularGlyph(), length = 3, width6
*///:~
