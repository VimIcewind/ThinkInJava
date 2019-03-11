// holding/ex31/RandomShapeGenerator.java
// TIJ4 Chapter Holding, Exercise 31
package holding.ex31;

import polymorphism.shape.*;

import java.util.*;

/**
 * Created by HWD on 2019/3/11 14:25
 */
public class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();

    public Shape make() {
        switch (rand.nextInt(3)) {
            default :
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
    }

    private Shape[] shapes;

    RandomShapeGenerator(int n) {
        shapes = new Shape[n];
        for (int i = 0; i < n; i++) {
            shapes[i] = make();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(20);
        for (Shape s : rsg) {
            System.out.println(s);
        }
    }
}
