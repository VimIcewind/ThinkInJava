//: ChocolateChip.java
// can't access friendly member
// in another class
package c05;

import c05.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        //! x.foo(); // Can't access foo
    }
} ///:~
