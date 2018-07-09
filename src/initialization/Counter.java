//: initialization/Counter.java
package initialization;

/**
 * Created by HWD on 2018-7-9.
 */
public class Counter {
    int i;
    Counter() {
        System.out.println(i);
        i = 7;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.i);
    }
    // ...
} /* Output:
0
7
*///:~
