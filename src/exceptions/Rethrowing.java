//: exceptions/Rethrowing.java
package exceptions;

/**
 * Created by HWD on 2019/3/23 21:30
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
originating the exception in f()
Inside g(), e.printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:10)
	at exceptions.Rethrowing.g(Rethrowing.java:15)
	at exceptions.Rethrowing.main(Rethrowing.java:35)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:10)
	at exceptions.Rethrowing.g(Rethrowing.java:15)
	at exceptions.Rethrowing.main(Rethrowing.java:35)
originating the exception in f()
Inside h(), e.printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:10)
	at exceptions.Rethrowing.h(Rethrowing.java:25)
	at exceptions.Rethrowing.main(Rethrowing.java:41)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.h(Rethrowing.java:29)
	at exceptions.Rethrowing.main(Rethrowing.java:41)
*///:~
