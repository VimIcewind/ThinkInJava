//: operators/PassObject.java
// Passing objects to method may not be
// what you're used to.
package operators;

import static net.mindview.util.Print.*;

class Letter {
    char c;
}

/**
 * Created by HWD on 2018-5-30.
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
} /* Output:
1: x.c: a
2: x.c: z
*///:~