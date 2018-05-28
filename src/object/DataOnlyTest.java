// TIJ4 Chapter Object, Exercise 4, page 90
// object/ATNTest.java
// Turn the DataOnly code fragments into a program that compiles and runs
package object;

/**
 * Created by HWD on 2018-5-28.
 */
public class DataOnlyTest {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly a = new DataOnly();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}
