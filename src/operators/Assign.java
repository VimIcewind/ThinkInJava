//: operators/Assign.java
// TIJ Chapter Operators, Execise 2, page 97
// Create a class containing a float and use it to demonstrate aliasing
package operators;

/**
 * Created by HWD on 2018-5-30.
 */
class Tube {
    float level;
}

public class Assign {
    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 0.47f;
        System.out.println("1: t1.level: " + t1.level + "t2.level: " + t2.level);
        t1 = t2;
        System.out.println("1: t1.level: " + t1.level + "t2.level: " + t2.level);
        t1.level = 0.27f;
        System.out.println("1: t1.level: " + t1.level + "t2.level: " + t2.level);
    }
}
