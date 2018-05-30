//: operators/Assignment.java
// Assignment with objects is a bit tricky
package operators;

import static net.mindview.util.Print.*;

/**
 * Created by HWD on 2018-5-30.
 */
class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
} /* Output:
1: t1.level: 9, t2.level: 47
1: t1.level: 47, t2.level: 47
1: t1.level: 27, t2.level: 27
*///:~
