// access/AccessTest.java
// TIJ4 Chapter Access, Exercise 5, page 153
// Create a class with public, private, protected and package-access fields and
// method members. Create an object of this class and see what kind of compiler
// messages you get when you try to access all the class members. Be aware that
// class in the same directory are part of the "default" package.
package access;

/**
 * Created by HWD on 2018-7-16.
 */
public class FourWays {
    int a = 0;
    public int b = 1;
    protected int c = 2;
    private int d = 3;

    public FourWays() {
        System.out.println("FourWays() constructor");
    }

    void showa() {
        System.out.println(a);
    }

    public void showb() {
        System.out.println(b);
    }

    protected void showc() {
        System.out.println(c);
    }

    private void showd() {
        showa();
    }
}
