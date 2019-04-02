// exceptions/ex10/Ex10.java
// TIJ4 Chapter Exception, Exercise 10
package exceptions.ex10;

/**
 * Created by HWD on 2019/4/2 19:49
 */
class GException extends Exception {
    GException(String s) {
        super(s);
    }
}

class HException extends Exception {
    HException(String s) {
        super(s);
    }
}

public class Ex10 {
    static void f() {
        try {
            try {
                g();
            } catch (GException ge) {
                System.out.println("Caught GException in f inner try");
                ge.printStackTrace();
                throw new HException("from f(), inner try");
            }
        } catch (HException he) {
            System.out.println("Caught HException in f() outer try");
        }
    }

    static void g() throws GException {
        throw new GException("from g()");
    }

    public static void main(String[] args) {
        f();
    }
}
