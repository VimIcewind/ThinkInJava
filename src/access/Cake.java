//: access/Cake.java
// Accesses a class in a separate comilation unit.
package access;

/**
 * Created by HWD on 2018-7-16.
 */
public class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
} /* Output:
*///:~
