//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;

import java.util.Random;

/**
 * Created by HWD on 2018-8-16.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
} ///:~
