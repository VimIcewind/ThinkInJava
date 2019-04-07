//: exceptions/NeverCaught.java
// Ignoring RuntimeExceptions.
// {ThrowException}
package exceptions;

/**
 * Created by HWD on 2019/4/7 20:57
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
} ///:~
