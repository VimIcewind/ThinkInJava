//: operators/StringOperators.java
package operators;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-6-7.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        print(s + x + y + z);
        print(x + " " + s); // Converts x to a String
        s += "(summed) = "; // Concatenation operator
        print(s + (x + y + z));
        print("" + x); // Shorthand for Integer.toString()
    }
} /* Output:
x, y, z012
0 x, y, z
x, y, z(summed) = 3
0
*///:~
