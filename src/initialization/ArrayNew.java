//: initialization/ArrayNew.java
// Create arrays with new.
package initialization;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-7-9.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print("length of a = " + a.length);
        print(Arrays.toString(a));
    }
} /* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*///:~
