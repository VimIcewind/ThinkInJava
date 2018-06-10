//: operators/Overflow.java
// Surprise! Java lets you overflow.

package operators;

/**
 * Created by HWD on 2018-6-10.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
} /* Output:
big = 2147483647
bigger = -4
*///:~
