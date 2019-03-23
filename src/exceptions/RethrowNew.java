//: exceptions/RethrowNew.java
// Rethrow a different object from the one that was caught.
package exceptions;

/**
 * Created by HWD on 2019/3/23 21:38
 */
class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStacktrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
originating the exception in f()
Caught in inner try, e.printStacktrace()
exceptions.OneException: thrown from f()
	at exceptions.RethrowNew.f(RethrowNew.java:23)
	at exceptions.RethrowNew.main(RethrowNew.java:29)
Caught in outer try, e.printStackTrace()
exceptions.TwoException: from inner try
	at exceptions.RethrowNew.main(RethrowNew.java:33)
*///:~
