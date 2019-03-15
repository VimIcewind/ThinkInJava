//: exceptions/FullConstructors.java
package exceptions;

/**
 * Created by HWD on 2019/3/15 21:44
 */
class MyException extends Exception {
    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Throwing MyException from f()
exceptions.MyException
	at exceptions.FullConstructors.f(FullConstructors.java:20)
	at exceptions.FullConstructors.main(FullConstructors.java:30)
Throwing MyException from g()
exceptions.MyException: Originated in g()
	at exceptions.FullConstructors.g(FullConstructors.java:25)
	at exceptions.FullConstructors.main(FullConstructors.java:35)
*///:~
