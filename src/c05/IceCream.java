//: IceCream.java
// Demonstrates "private" keyword

package c05;

class Sundae {
    private Sundae() {
        System.out.println("Soudae()");
    }

    static Sundae makeASundae() {
        System.out.println("makeASundae()");
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //! Sundae x  = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
} ///:~
