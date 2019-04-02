// exceptions/ex11/Ex11.java
package exceptions.ex11;

/**
 * Created by HWD on 2019/4/2 20:06
 */
class GException extends Exception {
    GException(String s) {
        super(s);
    }
}

public class Ex11 {
    static void f() {
        try {
            g();
        } catch (GException ge) {
            System.out.println("Caught GException in f try");
            ge.printStackTrace();
            throw new RuntimeException(ge);
        }
    }

    static void g() throws GException {
        throw new GException("from g()");
    }

    public static void main(String[] args) {
        f();
    }
}
