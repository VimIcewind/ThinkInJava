// exceptions/Ex1.java
// TIJ4 Chapter Exceptions, Exercise 1
package exceptions.ex1;

/**
 * Created by HWD on 2019/3/15 22:01
 */
class Exception1 extends Exception {
    public Exception1(String msg) {
        super(msg);
        System.out.println("Exception1(String msg)");
    }
}

public class Ex1 {
    public static void f() throws Exception1 {
        System.out.println("Throwing MyException from f()");
        throw new Exception1("From f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(Exception1 e) {
            System.out.println("Caught Exception1");
            e.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }
    }
}
