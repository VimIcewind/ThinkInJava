//: exceptions/Extrafeatures.java
// Further embellishment of exception classes.
package exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2019/3/19 09:01
 */
class MyException2 extends Exception {
    private int x;

    public MyException2() {

    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        print("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        print("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        print("Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
} /* Output:
Throwing MyException2 from f()
exceptions.MyException2: Detail Message: 0 null
	at exceptions.ExtraFeatures.f(ExtraFeatures.java:39)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:54)
Throwing MyException2 from g()
exceptions.MyException2: Detail Message: 0 Originated in g()
	at exceptions.ExtraFeatures.g(ExtraFeatures.java:44)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:59)
Throwing MyException2 from h()
exceptions.MyException2: Detail Message: 47 Originated in h()
	at exceptions.ExtraFeatures.h(ExtraFeatures.java:49)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:64)
e.val() = 47
*///:~
