//: control/ForEachInt.java
package control;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

/**
 * Created by HWD on 2018-6-19.
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(5, 10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(5, 20, 3)) {
            printnb(i + " ");
        }
        print();
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
*///:~
