//: Dinner.java
// Users the library
package c05;

import c05.dessert.*;

public class Dinner {
    public Dinner() {
        System.out.println("Dinner constructor");
    }

    public static void main(String[] args) {
        Cookie x = new Cookie();
        //! x.foo(); // Can't access
    }
} ///:~
