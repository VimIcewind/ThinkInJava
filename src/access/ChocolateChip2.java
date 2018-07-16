//: access/ChocolateChip.java
// Can't use package-access member from another package.
package access;

import access.cookie2.Cookie;

/**
 * Created by HWD on 2018-7-16.
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
} /* Output:
Cookie constructor
ChocolateChip2 constructor
bite
*///:~
