//: initialization/SimpleConstructor2.java
// Constructors can have arguments.
package initialization;

/**
 * Created by HWD on 2018-7-2.
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock" + i + " ");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
} /* Output:
Rock0 Rock1 Rock2 Rock3 Rock4 Rock5 Rock6 Rock7
*///:~
