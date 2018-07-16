//: access/IceCream.java
// Demonstrates "private" keyword.
package access;

/**
 * Created by HWD on 2018-7-16.
 */
class Sundae {
    private Sundae() {

    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
} ///:~
