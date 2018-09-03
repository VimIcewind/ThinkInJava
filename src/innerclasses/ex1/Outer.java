// innerclasses/ex1/Outer1.java
// TIJ4 Chapter Innerclasses, Exercise 1, page 224
/* Write a class named Outer that contains an inner class named Innet.
 * Ad a method to Outer that returns an object of type Inner. In main(),
 * create and initialize a reference to an Inner.
 */
package innerclasses.ex1;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner()");
        }
    }

    Outer() {
        System.out.println("Outer()");
    }

    Inner makeInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.makeInner();
    }
}
