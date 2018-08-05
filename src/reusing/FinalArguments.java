//: reusing/FinalArguments.java
// Using "final" with method arguments.
package reusing;

/**
 * Created by HWD on 2018-8-5.
 */
class Gizmo {
    public void spin() {

    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }

    // void f(final int i) {
    //     i++;
    // }

    // You can only read from a final primitive:
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments ba = new FinalArguments();
        ba.without(null);
        ba.with(null);
    }
} ///:~
